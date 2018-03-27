package com.beans.banking.esb.cifdetail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import com.beans.banking.esb.cifdetail.pojo.CifDetailHostRequest;

import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.MultiTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class PojoToTemplate {
	CifDetailHostRequest request = new CifDetailHostRequest();
	public PojoToTemplate() {
		execute(request);
	}
	private void execute(CifDetailHostRequest request) {
		Configuration cfg = new Configuration();
		String result = "";
		
		try {

			ClassTemplateLoader ctl = new ClassTemplateLoader(getClass(), "/templates");
			TemplateLoader[] loaders = new TemplateLoader[] { ctl };
			MultiTemplateLoader mtl = new MultiTemplateLoader(loaders);

			cfg.setTemplateLoader(mtl);  
			
			Template template = cfg.getTemplate("cifDetInq_request_xml.ftl");
			// Build the data-model
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("request", request);
			

			
			Writer out = new StringWriter(); 
			template.process(data, out); 
			result = out.toString();
			
		//	System.out.println("Result : ln" + out.toString());			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
	public static void main(String argv[]) {
		new PojoToTemplate();
	}
}
