package com.beans.banking.esb.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static SimpleDateFormat STANDARD_TIMESTAMP_FORMAT =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
	private static SimpleDateFormat TIME_WITH_MILLISECONDS_FORMAT =  new SimpleDateFormat("HHmmssSSS");

	public static String getFlowTimeStamp() {
		
		Date now = new Date();
		try { 
			return STANDARD_TIMESTAMP_FORMAT.format(now);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	public static String getTimeWithMilliseconds() {
		
		Date now = new Date();
		try { 
			return TIME_WITH_MILLISECONDS_FORMAT.format(now);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
}
