package com.beans.banking.esb.cifdetail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.io.IOUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.ibm.as400.data.RecordFormatDocument;
import com.ibm.as400.data.XmlException;

public class ByteToMap {
	
	List<String> keyList = new ArrayList<String>();
	
	public ByteToMap(){
		try {
			keyList = new XmlReader("/xml/CifDetInqRes.xml").getGoodresList();
		} catch (IOException e) {
			System.out.println("COught IO Exception");
			e.printStackTrace();
		}
	}
	
	public Map<String, String> byteToMap(byte[] resByte){
		Map<String,String> out = new LinkedHashMap<String, String>();
		
	//	System.out.println("ResLength "+resByte.length);
		
		byte[] padded = padBytes(resByte);
		
		RecordFormatDocument rfmlDoc;
		try {
			rfmlDoc = new RecordFormatDocument("com.beans.banking.esb.as400.CifDetInq");
		
		rfmlDoc.setValues("CifDetInqGoodResponse", padded);
		
		for(String goodres : keyList){
			
	//		System.out.println(""+goodres);
			
			out.put(goodres, rfmlDoc.getStringValue(goodres));
		}
		} catch (XmlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	System.out.println("Size of Map "+out.size());
		return out;
		
	}
	
	public byte[] padBytes(byte[] dataByte){
		byte[] goodResponseByte = null;
		int hostRespMsgLen = dataByte.length;	
		StringBuffer sb = new StringBuffer();
		// To Pad Good Response
		sb = new StringBuffer();
		int goodExpectedRespLen = 1644;
		int goodFillerLength = goodExpectedRespLen - hostRespMsgLen; 
		for (int i=0; i<goodFillerLength; i++){
		sb.append("40");
		}
		                           
		byte[] goodfiller = hexStringToByteArray2(sb.toString());
		goodResponseByte = new byte[hostRespMsgLen + goodFillerLength];
		               
		System.arraycopy(dataByte, 0, goodResponseByte, 0, hostRespMsgLen);
		System.out.println("hostRespMsgLen ==>" + hostRespMsgLen);
		if( goodFillerLength>0 ) {
		  System.out.println("SOA padding the filler to the response message ..." + sb.toString());
		System.arraycopy(goodfiller, 0, goodResponseByte, hostRespMsgLen, goodfiller.length);
	    }
		return goodResponseByte;
	}

	public static final byte [] hexStringToByteArray2(final String hex) {
		byte [] bytes = new byte[(hex.length() / 2)];
		int j = 0;
		for ( int i=0; i<bytes.length; i++ ) {
			j = i * 2;
			String hex_pair = hex.substring(j,j+2);
			byte b = (byte) (Integer.parseInt(hex_pair, 16) & 0xFF);
			bytes [i] = b;
		}
		return bytes;
	}
	
	static class XmlReader extends DefaultHandler{
		
		public XmlReader(String xmlFileName) throws IOException{
			
			InputStream responseXML = getClass().getResourceAsStream(xmlFileName);
			parseDocument(responseXML);
		}
		
		Map<String, Boolean> elements = new LinkedHashMap<String, Boolean>();
		List<String> goodresList = new ArrayList<String>();
		
		public List<String> getGoodresList() {
			return goodresList;
		}

		private void parseDocument(InputStream responseXML) {
			// parse
			SAXParserFactory factory = SAXParserFactory.newInstance();
			try {
				SAXParser saxParser = factory.newSAXParser();
				saxParser.parse(responseXML, this);
			} catch (ParserConfigurationException e) {
				System.out.println("ParserConfig error in ByteToMap");
			} catch (SAXException e) {
				System.out.println("SAXException in ByteToMap: xml not well formed");
			} catch (IOException e) {
				System.out.println("IO error in ByteToMap");
			}
		}	

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			if (!qName.equalsIgnoreCase("DOC")) {
				elements.put(qName, true);
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			if (!qName.equalsIgnoreCase("DOC")) {
				elements.remove(qName);
			}
		}

		@Override
		public void characters(char ch[], int start, int length) throws SAXException {
			String temp = new String(ch, start, length);
			temp = temp.replace("\n", "");
			temp = temp.replace("\t", "");
			if (temp != null && !temp.equals("")) {
				StringBuilder rfmlTag = new StringBuilder();
				int i = 0;
				for (Map.Entry<String, Boolean> entry : elements.entrySet()) {
					i++;
					if (entry.getValue()) {
						rfmlTag.append(entry.getKey());
						if (elements.size()!=i) {
							rfmlTag.append(".");
						}
					}
				}
				if(rfmlTag.toString().contains("CifDetInqGoodResponse.GoodResponse.")){
				//	System.out.println("RFML Tag"+rfmlTag.toString());
					goodresList.add(rfmlTag.toString());
				}
				
			}
		}
		
		
	}
	
	
}
