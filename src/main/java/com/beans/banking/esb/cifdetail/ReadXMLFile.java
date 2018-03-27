package com.beans.banking.esb.cifdetail;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.ibm.as400.data.RecordFormatDocument;

public class ReadXMLFile extends DefaultHandler {
	
	Map<String, Boolean> elements = new LinkedHashMap<String, Boolean>();
	Map<String, String> out = new LinkedHashMap<String, String>();
	byte[] dataByte = null;
	
	public ReadXMLFile(InputSource requestXML) {
		parseDocument(requestXML);
	}
	
	public Map<String, String> getMap() {
		return out;
	}
	
	public void generateHostCardInqRequestMessage(Map<String, String> request) {
		try {
			RecordFormatDocument rfmlDoc = new RecordFormatDocument("com.beans.banking.esb.as400.CifDetInq");
			for (Map.Entry<String, String> entry : request.entrySet()) {
				rfmlDoc.setValue(entry.getKey(), entry.getValue());
			}
			dataByte = rfmlDoc.toByteArray("CifDetInqRequest");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public byte[] getDataByte() {
		return dataByte;
	}
	public void setDataByte(byte[] dataByte) {
		this.dataByte = dataByte;
	}
	
	private void parseDocument(InputSource requestXML) {
		// parse
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser = factory.newSAXParser();
			saxParser.parse(requestXML, this);
		} catch (ParserConfigurationException e) {
			System.out.println("ParserConfig error in XmlToMap");
		} catch (SAXException e) {
			System.out.println("SAXException in XmlToMap: xml not well formed");
		} catch (IOException e) {
			System.out.println("IO error in XmlToMap");
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	//	System.out.println("Start Element :" + qName);
		if (!qName.equalsIgnoreCase("DOC")) {
			elements.put(qName, true);
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
	//	System.out.println("End Element :" + qName);
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
			//	System.out.println("size: " + elements.size());
			//	System.out.println("element: " + i);
				if (entry.getValue()) {
					rfmlTag.append(entry.getKey());
					if (elements.size()!=i) {
						rfmlTag.append(".");
					}
				}
			}
			out.put(rfmlTag.toString(), new String(ch, start, length));
		}
	}

	/*public static void main(String argv[]) {
		Map<String, String> out = new LinkedHashMap<String, String>();
		out = new ReadXMLFile("C:\\Users\\User\\workspace\\xml\\xml\\CifDetInq.xml").getMap();
		byte[] byteOut = new ReadXMLFile(out).getDataByte();
	}*/

}