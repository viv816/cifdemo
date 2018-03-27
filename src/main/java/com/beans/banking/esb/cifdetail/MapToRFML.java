package com.beans.banking.esb.cifdetail;

import java.util.Map;

import com.ibm.as400.data.RecordFormatDocument;

public class MapToRFML {
	
	public byte[] generateHostCardInqRequestMessage(Map<String, String> request) {
		
		byte[] dataByte = null;
		
		try {
			RecordFormatDocument rfmlDoc = new RecordFormatDocument("com.beans.banking.esb.as400.CifDetInq");
			for (Map.Entry<String, String> entry : request.entrySet()) {
				rfmlDoc.setValue(entry.getKey(), entry.getValue());
			}
			dataByte = rfmlDoc.toByteArray("CifDetInqRequest");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataByte;
	}

}
