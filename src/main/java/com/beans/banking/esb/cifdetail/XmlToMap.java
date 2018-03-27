package com.beans.banking.esb.cifdetail;

import java.io.StringReader;
import java.util.Map;

import org.xml.sax.InputSource;

public class XmlToMap {
	
	public Map<String, String> toMap(String xml){
		
		InputSource requestXML = new InputSource(new StringReader(xml));
		
		ReadXMLFile readXmlFile = new ReadXMLFile(requestXML);
		
		return readXmlFile.getMap();
	}

}
