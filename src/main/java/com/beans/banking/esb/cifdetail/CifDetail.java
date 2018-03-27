package com.beans.banking.esb.cifdetail;

import java.io.File;
import java.io.FileInputStream;
import java.net.ConnectException;
import java.util.List;
import java.util.Properties;

import org.apache.camel.Exchange;
import org.apache.camel.ManagementStatisticsLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.bean.validator.BeanValidationException;
import org.apache.camel.component.metrics.routepolicy.MetricsRoutePolicyFactory;
import org.apache.camel.component.netty4.ChannelHandlerFactory;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.beans.banking.esb.cifdetail.pojo.CifDetailHostRequest;
import com.beans.banking.esb.cifdetail.pojo.CifDetailResponse;
import com.beans.banking.esb.util.ByteArrayCodecFactory;



/**
 *
 * @author sky
 */
@SpringBootApplication
public class CifDetail {

	public static void main( String [] args ) {
		SpringApplication.run(CifDetail.class, args);
	}

	@Bean
	RouteBuilder balanceInquiryRouteBuilder() {
		return new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				
				Properties configFile1 = new java.util.Properties();
				Properties configFile2 = new java.util.Properties();
				
				String authFile = "authentication.properties";
				
//				File file = new File("/etc/config/"+authFile);
//				
//				if(file !=null){
//			    
//				FileInputStream inputStream = new FileInputStream(file);
//				try {
//					
//					configFile1.load(inputStream);
//					
//					String pwsd = configFile1.getProperty("venu");
//					
//					System.out.println("Password for venu is "+ pwsd);
//				   
//				    
//				} finally {
//				    inputStream.close();
//				}}
//				
//				String authzFile = "authorization.properties";
//				
//				File file2 = new File("/etc/config/"+authzFile);
//				if(file2 !=null){
//			    
//				FileInputStream inputStream2 = new FileInputStream(file2);
//				try {
//					
//					configFile2.load(inputStream2);
//					
//					String cb2 = configFile2.getProperty("cb2");
//					
//					System.out.println("Users for cb2 are "+ cb2);
//					
//				} finally {
//				    inputStream2.close();
//				}}

				
				DefaultCamelContext camelContext = (DefaultCamelContext) getContext();
				
				camelContext.getManagementStrategy().getManagementAgent().setStatisticsLevel(ManagementStatisticsLevel.RoutesOnly);
				camelContext.getManagementStrategy().getManagementAgent().setLoadStatisticsEnabled(true);
				
				camelContext.addRoutePolicyFactory(new MetricsRoutePolicyFactory());

				onException(BeanValidationException.class)
				.handled(true) 
				//.to("bean:validationFailHandler");
				.bean(ValidationFailHandler.class, "handleException");
				
				onException(ConnectException.class)
				.handled(true) 
				.bean(ConnectionExceptionHandler.class, "handleException");
				
				restConfiguration()
				.host("0.0.0.0")
				.port(9087)
				.bindingMode(RestBindingMode.auto);

				rest("/cifDetail/").id("cif-detail-esb-route")
				.post().type(CifDetailHostRequest.class)
				//.outType(CifDetailHostResponseBody.class)
				.outType(CifDetailResponse.class)
                .produces("application/json")
//				.to("direct://handleRequest");
//				
//				from("direct://handleRequest")
                .route()
				.bean(LogRequestObject.class,"getRequest")
				.to("bean-validator://BeanValidationException")
				.to("freemarker://templates/cifDetInq_request_xml.ftl")
				.bean(XmlToMap.class)
				.bean(MapToRFML.class)
				.to("netty4:tcp://192.168.0.21:8083/?decoders=#decoders&encoders=#encoder")
				//.bean(ByteToMap.class,"byteToMap")
				  .bean(ByteToPojo.class,"getResponse")
				//.to("freemarker://templates/cifDetInq_response_xml.ftl")
				//.bean(CifDetailValidator.class, "handle")
				;
			}
		};
	}

	@Bean
	List<ChannelHandlerFactory> decoders(){
		return ByteArrayCodecFactory.getDecoders();
	}
	
	@Bean
	ChannelHandlerFactory encoder(){
		return ByteArrayCodecFactory.newByteArrayEncoder();
	}
	
	@Bean
	ValidationFailHandler validationFailHandler() {
		return new ValidationFailHandler();
	}
	
	  public static class LogRequestObject {
			
			public void getRequest(Exchange ex){
				
				CifDetailHostRequest req = ex.getIn().getBody(CifDetailHostRequest.class);
				System.out.println("Request is "+req.toString());
				
			}
			
		}

	public static class ValidationFailHandler {
		@org.apache.camel.Handler
		public String handleException( Exchange ex, Exception e) {

			return e.toString();
		}
	}
	
	@Bean
	ConnectionExceptionHandler connectionExceptionHandler(){
		return new ConnectionExceptionHandler();
	}
	
	public static class ConnectionExceptionHandler  {

		public ConnectionExceptionHandler() {
	        super();
	    }

	    @org.apache.camel.Handler
		public String handleException( Exchange ex, Exception e) {
	    	System.out.println("Error IN TCP Connection ");	
	    	e.printStackTrace();
			return e.toString();
		}
	}
}
