package com.beans.banking.esb.util;

import java.math.BigDecimal;
import java.util.Random;

import com.beans.banking.esb.util.CommonConstant;

public class MessageUtil {
	
public static String extractPredefinedExceptionMessage(String value) {
		
		if (value==null) 		
			return "";
		
		if (value.indexOf(CommonConstant.CLOSE_SQUARE_BRACKET) != -1) {
		    String[] msgArray = value.split(CommonConstant.CLOSE_SQUARE_BRACKET);	
		    return msgArray[msgArray.length-1];
		} else {
			return value;
		}		
		
	}
	
	public static String generateAcquireUniqueRefNumber () {
		
		StringBuffer buffer = new StringBuffer(12);
		buffer.append(DateUtil.getTimeWithMilliseconds()).
			   append(randInt(1,9)).
			   append(randInt(1,9)).
			   append(randInt(1,9));
		
		return buffer.toString();
	}
	
	public static int randInt(int min, int max) {

	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max + 1) - min) + min;

	    return randomNum;
	}
	
	
	public static String getBigDecimalInCentFormat(BigDecimal decimal) {
		
		if (decimal!=null) {
			BigDecimal tempDecimal = decimal.setScale(2);			
			return tempDecimal.toPlainString().replaceAll("[.]", "");
		}
		else {
			return "0";
		}
				
	}
	
	public static String getBigDecimalInStringFormatWithTwoDecimal(BigDecimal decimal) {
		
		if (decimal!=null) {
			BigDecimal tempDecimal = decimal.setScale(2);			
			return tempDecimal.toPlainString();
		}
		else {
			return "0";
		}
				
	}
	
	public static String getStringValueFromPOJO(String value) {
		
		if (value == null) {
			return CommonConstant.EMPTY_VALUE;
		}
		else {
			if ("null".equalsIgnoreCase(value)) {
				return CommonConstant.EMPTY_VALUE;
			}
			
			return value.trim();
		}
	}
	
	public static String getEbcdicFormatInASCII(byte[] message) {
		
		try {
			return new String(message, CommonConstant.EBCDIC_CCSID_VALUE);
			
		} catch (Exception e)
		{
			return CommonConstant.EMPTY_VALUE;
		}
	}
	
	public static String padLeft(String str, int totalLength, char padChar){
		String padding = "";
		if (str==null) str="";
		for(int i = 0; i < (totalLength - str.length()); i++){
			padding += padChar;
		}
		return padding + str;
	}
	
	public static String padRight(String str, int totalLength, char padChar){
		String padding = "";
		if (str==null) str="";
		for(int i = 0; i < (totalLength - str.length()); i++){
			padding += padChar;
		}
		return str + padding;
	}
	
	public static String extractElement(String xml, String name) {
		int i1 = xml.indexOf("<"+name+">");
		int i2 = xml.indexOf("</"+name+">");
		if(i1>0 && i2>0) {
			return xml.substring((i1+name.length()+2), i2);
		}
		return "";
	}
	
	public static String replaceEscape(String xml) throws Exception{
		String s = "";
		try{
			s = xml.replaceAll("&lt;", "<");
			s = s.replaceAll("&gt;", ">");
			s = s.replaceAll("''", "&quot;");
			s = s.replaceAll("'", "&apos;");
			s = s.replaceAll("&", "&amp;");
		}catch (Exception e){
			//throw new Exception(CommonConstant.REPLACE_ESCAPE_ERR + e.getMessage());
		}
		return s;
	}
	
	public static String escapeXml(String xml){
		String s = "";
		s = xml.replaceAll("&amp;", "&");
		s = s.replaceAll("&gt;", ">");
		s = s.replaceAll("&lt;", "<");
		s = s.replaceAll("&apos;", "'");
		
		s = s.replaceAll("&", "&amp;");
		s = s.replaceAll(">", "&gt;");
		s = s.replaceAll("<", "&lt;");
		s = s.replaceAll("'", "&apos;");
		return s;
	}
}
