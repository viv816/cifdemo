package com.beans.banking.esb.cifdetail;

import com.beans.banking.esb.cifdetail.pojo.CifDetailHostResponse;
import com.beans.banking.esb.util.MessageUtil;
import com.ibm.as400.data.RecordFormatDocument;

public class CifDetInq {

	private static String EMPTY_VALUE = "";
	private static int ZERO_VALUE = 0;
	private static int ONE_VALUE = 1;
	private static double ZERO_DOUBLE_VALUE = 0.00;
	
	private static CifDetInq instance = new CifDetInq();
	
	
	public static CifDetInq getInstance() {		
		return instance;
	}
	
	/* 
	 * TODO : 1. put request pojo
	 *        2. use property holder for constant value  
	 *        3. change to use serialize instead of calling rfml doc.
	 * */ 
	
	/*public byte[] generateHostCifDetInqRequestMessage(CifDetInqHostRequest request) 
	{
		byte[] dataByte = null;
		
		try {
			RecordFormatDocument rfmlDoc = new RecordFormatDocument("com.beans.arrahnu.esb.as400.CifDetInq");
			
			 Start Socket Header 
			rfmlDoc.setValue("CifDetInqRequest.SocketHeader.SKTMLEN", request.getSKTMLEN());
			rfmlDoc.setValue("CifDetInqRequest.SocketHeader.SKTHEAD", request.getSKTHEAD());
			rfmlDoc.setValue("CifDetInqRequest.SocketHeader.SKTDEV", request.getSKTDEV());  IP 
			rfmlDoc.setValue("CifDetInqRequest.SocketHeader.SKTFILL", AS400Constant.SKTFILL_CONSTANT_VALUE);			
			 End Socket Header 
			
			 Start DSP Header 
			rfmlDoc.setValue("CifDetInqRequest.DSPHeader.I13HLEN", request.getI13HLEN());
			rfmlDoc.setValue("CifDetInqRequest.DSPHeader.I13MLEN", request.getI13MLEN());
			rfmlDoc.setValue("CifDetInqRequest.DSPHeader.I13VERS", request.getI13VERS());
			rfmlDoc.setValue("CifDetInqRequest.DSPHeader.I13HFMID", request.getI13HFMID());
			rfmlDoc.setValue("CifDetInqRequest.DSPHeader.I13FMID", request.getI13FMID());
			rfmlDoc.setValue("CifDetInqRequest.DSPHeader.I13SID", request.getI13SID());
			rfmlDoc.setValue("CifDetInqRequest.DSPHeader.I13SSNO", request.getI13SSNO());
			rfmlDoc.setValue("CifDetInqRequest.DSPHeader.I13TMNO", request.getI13TMNO());
			rfmlDoc.setValue("CifDetInqRequest.DSPHeader.I13NREC", request.getI13NREC());
			rfmlDoc.setValue("CifDetInqRequest.DSPHeader.I13NERR", request.getI13NERR());
			rfmlDoc.setValue("CifDetInqRequest.DSPHeader.I13TTYP", request.getI13TTYP());
			 End DSP Header 
			
			 Start Mbase Header 
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRIND", request.getHDRIND());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDUSID", request.getHDUSID());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDEGPI", request.getHDEGPI());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDSRID", request.getHDSRID());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDDSID", request.getHDDSID());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRTDQ", request.getHDRTDQ());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDTMID", request.getHDTMID());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDBKNO", request.getHDBKNO()); 
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDBRNO", request.getHDBRNO());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRSID", request.getHDRSID());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDTSID", request.getHDTSID());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDHSID", request.getHDHSID());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDTXCD", request.getHDTXCD()); 
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDACCD", request.getHDACCD());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDTMOD", request.getHDTMOD());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDMREC", request.getHDMREC());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDSMTD", request.getHDSMTD());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRCD1", request.getHDRCD1());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRRE1", request.getHDRRE1());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRCD2", request.getHDRCD2());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRRE2", request.getHDRRE2());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRCD3", request.getHDRCD3());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRRE3", request.getHDRRE3());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRCD4", request.getHDRCD4());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRRE4", request.getHDRRE4());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRCD5", request.getHDRCD5());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDRRE5", request.getHDRRE5());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDACTY", request.getHDACTY());
			rfmlDoc.setValue("CifDetInqRequest.MBaseHeader.HDFILR", request.getHDFILR());
			 End Mbase Header 
			
			
			 Start Request Body 
			rfmlDoc.setValue("CifDetInqRequest.RequestBody.CFCIFN", request.getCustNo());  Customer Number 
			 End Request Body 
			
			
			dataByte = rfmlDoc.toByteArray("CifDetInqRequest");
			//System.out.println("data : " + dataByte.length);
			//System.out.println("data : " + new String(dataByte, "cp037"));
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return dataByte;
	}	
	*/
	
	public CifDetailHostResponse getCifDetInqHostResponseMessage(byte[] hostResponse) throws Exception {
	
		CifDetailHostResponse response = new CifDetailHostResponse();
					
		RecordFormatDocument document = generateHostCifDetInqMessage(hostResponse);
		
		
		//long dateOfBirth = document.getIntValue("CifDetInq.GoodResponse.CFBIR6");
		//==null?"0":document.getStringValue("CifDetInq.GoodResponse.CFMAR6"));
		//long maritalStatDate = document.getIntValue("CifDetInq.GoodResponse.CFMAR6");
		//response.setMaritalStatDate(maritalStatDate);
		//String strMaritalStatDate = document.getStringValue("CifDetInq.GoodResponse.CFMAR6")==null?"0":document.getStringValue("CifDetInq.GoodResponse.CFMAR6");
		//long maritalStatDate = new BigDecimal(strMaritalStatDate).longValue();
		
		response.setCustNumb(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFCIFN"));
		response.setBankNo(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFBNKN"));
		response.setIdNo1(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFSSNO1"));
		response.setIdNo2(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFSSNO2"));
		response.setIdType(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFSSCD"));
		response.setBranchNo(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFBRNN"));
		response.setCifGrpCode(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFGRUP"));
		response.setLegalName1(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA1"));
		response.setLegalName2(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA1A"));
		response.setPrefName1(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA1W"));
		response.setPrefName2(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA1AW"));
		response.setCFClass(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFCLAS"));
		response.setBnmSecCode(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CRSECT"));
		response.setBirthDate(MessageUtil.padLeft(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFBIR6"), 6, '0'));
		response.setRace(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFRACE"));
		response.setFedWHCode(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFWHCD"));
		response.setCustType(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFCIFT"));
		response.setCitizenCountry(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFCITZ"));
		response.setHrAddLine1(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA2H"));
		response.setHrAddLine2(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA3H"));
		response.setHrAddLine3(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA4H"));
		response.setHrAddLine4(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA5H"));
		response.setHrAddLinePostCode(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFZIPH"));
		response.setCorrAddLine1(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA2C"));
		response.setCorrAddLine2(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA3C"));
		response.setCorrAddLine3(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA4C"));
		response.setCorrAddLine4(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFNA5C"));
		response.setCorrPostCode(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFZIPC"));
		response.setIncome(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFEICM"));
		response.setEmpStart(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFEES6"));
		response.setLangID(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFLGID"));
		response.setElecAddOff(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFEADDO"));
		response.setElecAddHome(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFEADDH"));
		response.setElecAddHP(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFEADDP"));
		response.setElecAddFaxNo(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFEADDF"));
		response.setOriCustDate(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFORG6"));
		response.setHouseOwnerCode(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFHOCD"));
		response.setPresentAddStayDur(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFDURA"));
		response.setLastMaintDate(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFDLM6"));
		response.setMonthlyInc(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFMTHI"));
		response.setElecAddEmail(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFEADDM"));
		response.setJobDesCode(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFEJCD"));
		response.setMotherMaidenName(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFMOTH"));
		response.setBlacklistFlag(document.getStringValue("CifDetInqGoodResponse.GoodResponse.WKBLST"));
		response.setOwnRel(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFRELP"));
		response.setSalutation(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFZSAL"));
		response.setGender(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFSEX"));
		response.setMaritalStatCode(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFMARS"));
		response.setRelCode(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFRELI"));
		response.setEduLevel(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFEDLV"));
		response.setEmpName(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFENA1"));
		response.setBizType(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFBUST"));
		response.setIncomeBracketCode(document.getStringValue("CifDetInqGoodResponse.GoodResponse.CFEICD"));

		return response;
	}
	
	
	private RecordFormatDocument generateHostCifDetInqMessage(byte[] response) throws Exception
	{
		RecordFormatDocument rfmlDoc = null;
		rfmlDoc = new RecordFormatDocument("com.beans.banking.esb.as400.CifDetInq");
		rfmlDoc.setValues("CifDetInqGoodResponse", response);

		return rfmlDoc;
	}
	
	public CifDetailHostResponse getHostCifDetInqBadResponseMessage(byte[] hostResponse) throws Exception {
		
		CifDetailHostResponse response = new CifDetailHostResponse();
		RecordFormatDocument document = generateHostCifDetInqBadResponseMessage(hostResponse);
//		String errorCode = document.getStringValue("CifDetInqBadResponse.MBaseHeader.HDRIND");
		String errorMsg = document.getStringValue("CifDetInqBadResponse.MBaseHeader.HDRRE1");
		String reasonCode = document.getStringValue("CifDetInqBadResponse.MBaseHeader.HDRCD1");
		//System.out.println("HOST error response code : " + new BigDecimal(document.getStringValue("HostBillPaymentBadResponse.ErrorResponse42.ERN1")).intValue());
		//System.out.println(errorMsg);
		//response.setErrorCode(ErrorCodeConstants.CODE_TXN_IS_REJECTED);
		response.setErrorCode("Transaction Rejected");
		response.setErrorMsg(errorMsg);
		response.setReasonCode(reasonCode);
		response.setResponseCode(1);
		//response.setAccountNumber(CommonConstant.LONG_ZERO_ZMOUNT);
		//response.setAvailableBalance(CommonConstant.BIG_DECIMAL_ZERO_ZMOUNT);
		//response.setLedgerBalance(CommonConstant.BIG_DECIMAL_ZERO_ZMOUNT);
			
		return response;
		
	}
	
	private RecordFormatDocument generateHostCifDetInqBadResponseMessage(byte[] response) throws Exception
	{
		RecordFormatDocument rfmlDoc = null;
		rfmlDoc = new RecordFormatDocument("com.beans.banking.esb.as400.CifDetInq");
		rfmlDoc.setValues("CifDetInqBadResponse", response);

		return rfmlDoc;
	}
	
}
