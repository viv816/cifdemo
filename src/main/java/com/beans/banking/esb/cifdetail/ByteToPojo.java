package com.beans.banking.esb.cifdetail;

import com.beans.banking.esb.cifdetail.pojo.CifDetailHostResponse;
import com.beans.banking.esb.cifdetail.pojo.CifDetailHostResponseBody;
import com.beans.banking.esb.cifdetail.pojo.CifDetailResponse;
import com.beans.banking.esb.util.CommonConstant;
import com.beans.banking.esb.util.MessageUtil;

public class ByteToPojo {
	
	public CifDetailResponse getResponse(byte[] resByte) throws Exception{
		
		CifDetailHostResponse hostResponse = null;
		
		CifDetailResponse response = null;
		
		if (validateHostResponse(resByte)) {
	
		byte[] goodResponseByte = null;
		int hostRespMsgLen = resByte.length;	
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
		               
		System.arraycopy(resByte, 0, goodResponseByte, 0, hostRespMsgLen);
		System.out.println("hostRespMsgLen ==>" + hostRespMsgLen);
		if( goodFillerLength>0 ) {
		  System.out.println("SOA padding the filler to the response message ..." + sb.toString());
		System.arraycopy(goodfiller, 0, goodResponseByte, hostRespMsgLen, goodfiller.length);
	    }

		hostResponse = generateGoodResponseMessage(goodResponseByte);
		} else {
			hostResponse = generateBadResponseMessage(resByte);
		}
		
		response = constructHostResponseMessage(hostResponse);
		
		return response;
		
	}
	
	public CifDetailHostResponse generateGoodResponseMessage(byte[] responseData) throws Exception {

		CifDetInq cifDetInq = CifDetInq.getInstance();			
		CifDetailHostResponse hostResponse = cifDetInq.getCifDetInqHostResponseMessage(responseData);	
		return hostResponse;
	}

	public CifDetailHostResponse generateBadResponseMessage(byte[] responseData) throws Exception {

		CifDetInq cifDetInq = CifDetInq.getInstance();			
		CifDetailHostResponse hostResponse = cifDetInq.getHostCifDetInqBadResponseMessage(responseData);	
		return hostResponse;
	}
	
	public CifDetailResponse constructHostResponseMessage(CifDetailHostResponse response) {

		CifDetailResponse cifDetInqResponse = new CifDetailResponse();
		//RequestHeader reqHeader = message.getHeader();

		CifDetailHostResponseBody detail = new CifDetailHostResponseBody();

		/*header.setMsgVerNo(MessageUtil.getStringValueFromPOJO(reqHeader.getMsgVerNo()));
		header.setTransType(MessageUtil.getStringValueFromPOJO(reqHeader.getTransType()));
		header.setApplName(MessageUtil.getStringValueFromPOJO(reqHeader.getApplName()));
		header.setApplID(MessageUtil.getStringValueFromPOJO(reqHeader.getApplID()));
		header.setApplTransID(MessageUtil.getStringValueFromPOJO(reqHeader.getApplTransID()));
		header.setTransDate(MessageUtil.getStringValueFromPOJO(reqHeader.getTransDate()));
		header.setTransTime(MessageUtil.getStringValueFromPOJO(reqHeader.getTransTime()));
		header.setTransUserID(MessageUtil.getStringValueFromPOJO(reqHeader.getTransUserID()));
		header.setTransUserInfo(MessageUtil.getStringValueFromPOJO(reqHeader.getTransUserInfo()));
		header.setApplUserID(MessageUtil.getStringValueFromPOJO(reqHeader.getApplUserID()));
		header.setBankCode(MessageUtil.getStringValueFromPOJO(reqHeader.getBankCode()));
		header.setBranchNo(MessageUtil.getStringValueFromPOJO(reqHeader.getBranchNo()));
		header.setControlUnit(MessageUtil.getStringValueFromPOJO(reqHeader.getControlUnit()));*/
		//header.setRequestTimestamp("");
		//header.setResponseTimestamp("");

		if (response.getResponseCode() == CommonConstant.AR_RAHNU_HOST_GOOD_RESPCODE) {
			//header.setResponseCode(String.valueOf(ArRahnuConstant.AR_RAHNU_HOST_GOOD_RESPCODE));

			detail.setCustNumber(MessageUtil.getStringValueFromPOJO(response.getCustNumber()));
			detail.setCustNumb(MessageUtil.getStringValueFromPOJO(response.getCustNumb()));
			detail.setBankNo(MessageUtil.getStringValueFromPOJO(response.getBankNo()));
			detail.setIdNo1(MessageUtil.getStringValueFromPOJO(response.getIdNo1()));
			detail.setIdNo2(MessageUtil.getStringValueFromPOJO(response.getIdNo2()));
			detail.setIdType(MessageUtil.getStringValueFromPOJO(response.getIdType()));
			detail.setBranchNo(MessageUtil.getStringValueFromPOJO(response.getBranchNo()));
			detail.setCifGrpCode(MessageUtil.getStringValueFromPOJO(response.getCifGrpCode()));
			detail.setLegalName1(MessageUtil.getStringValueFromPOJO(response.getLegalName1()));
			detail.setLegalName2(MessageUtil.getStringValueFromPOJO(response.getLegalName2()));
			detail.setPrefName1(MessageUtil.getStringValueFromPOJO(response.getPrefName1()));
			detail.setPrefName2(MessageUtil.getStringValueFromPOJO(response.getPrefName2()));
			detail.setCFClass(MessageUtil.getStringValueFromPOJO(response.getCFClass()));
			detail.setBnmSecCode(MessageUtil.getStringValueFromPOJO(response.getBnmSecCode()));
			detail.setBirthDate(MessageUtil.getStringValueFromPOJO(response.getBirthDate()));
			detail.setRace(MessageUtil.getStringValueFromPOJO(response.getRace()));
			detail.setFedWHCode(MessageUtil.getStringValueFromPOJO(response.getFedWHCode()));
			detail.setCustType(MessageUtil.getStringValueFromPOJO(response.getCustType()));
			detail.setCitizenCountry(MessageUtil.getStringValueFromPOJO(response.getCitizenCountry()));
			detail.setHrAddLine1(MessageUtil.getStringValueFromPOJO(response.getHrAddLine1()));
			detail.setHrAddLine2(MessageUtil.getStringValueFromPOJO(response.getHrAddLine2()));
			detail.setHrAddLine3(MessageUtil.getStringValueFromPOJO(response.getHrAddLine3()));
			detail.setHrAddLine4(MessageUtil.getStringValueFromPOJO(response.getHrAddLine4()));
			detail.setHrAddLinePostCode(MessageUtil.getStringValueFromPOJO(response.getHrAddLinePostCode()));
			detail.setCorrAddLine1(MessageUtil.getStringValueFromPOJO(response.getCorrAddLine1()));
			detail.setCorrAddLine2(MessageUtil.getStringValueFromPOJO(response.getCorrAddLine2()));
			detail.setCorrAddLine3(MessageUtil.getStringValueFromPOJO(response.getCorrAddLine3()));
			detail.setCorrAddLine4(MessageUtil.getStringValueFromPOJO(response.getCorrAddLine4()));
			detail.setCorrPostCode(MessageUtil.getStringValueFromPOJO(response.getCorrPostCode()));
			detail.setIncome(MessageUtil.getStringValueFromPOJO(response.getIncome()));
			detail.setEmpStart(MessageUtil.getStringValueFromPOJO(response.getEmpStart()));
			detail.setLangID(MessageUtil.getStringValueFromPOJO(response.getLangID()));
			detail.setElecAddOff(MessageUtil.getStringValueFromPOJO(response.getElecAddOff()));
			detail.setElecAddHome(MessageUtil.getStringValueFromPOJO(response.getElecAddHome()));
			detail.setElecAddHP(MessageUtil.getStringValueFromPOJO(response.getElecAddHP()));
			detail.setElecAddFaxNo(MessageUtil.getStringValueFromPOJO(response.getElecAddFaxNo()));
			detail.setOriCustDate(MessageUtil.getStringValueFromPOJO(response.getOriCustDate()));
			detail.setHouseOwnerCode(MessageUtil.getStringValueFromPOJO(response.getHouseOwnerCode()));
			detail.setPresentAddStayDur(MessageUtil.getStringValueFromPOJO(response.getPresentAddStayDur()));
			detail.setLastMaintDate(MessageUtil.getStringValueFromPOJO(response.getLastMaintDate()));
			detail.setMonthlyInc(MessageUtil.getStringValueFromPOJO(response.getMonthlyInc()));
			detail.setElecAddEmail(MessageUtil.getStringValueFromPOJO(response.getElecAddEmail()));
			detail.setJobDesCode(MessageUtil.getStringValueFromPOJO(response.getJobDesCode()));
			detail.setMotherMaidenName(MessageUtil.getStringValueFromPOJO(response.getMotherMaidenName()));
			detail.setBlacklistFlag(MessageUtil.getStringValueFromPOJO(response.getBlacklistFlag()));
			detail.setOwnRel(MessageUtil.getStringValueFromPOJO(response.getOwnRel()));
			detail.setSalutation(MessageUtil.getStringValueFromPOJO(response.getSalutation()));
			detail.setGender(MessageUtil.getStringValueFromPOJO(response.getGender()));
			detail.setMaritalStatCode(MessageUtil.getStringValueFromPOJO(response.getMaritalStatCode()));
			detail.setRelCode(MessageUtil.getStringValueFromPOJO(response.getRelCode()));
			detail.setEduLevel(MessageUtil.getStringValueFromPOJO(response.getEduLevel()));
			detail.setEmpName(MessageUtil.getStringValueFromPOJO(response.getEmpName()));
			detail.setBizType(MessageUtil.getStringValueFromPOJO(response.getBizType()));
			detail.setIncomeBracketCode(MessageUtil.getStringValueFromPOJO(response.getIncomeBracketCode()));

			/*
				if(response.getAnnTurnover() != null)
					detail.setAnnTurnover(MessageUtil.getStringValueFromPOJO(response.getAnnTurnover()));
				detail.setSector(MessageUtil.getStringValueFromPOJO(response.getSector()));
				detail.setNoOfFullTimeEmp(MessageUtil.getStringValueFromPOJO(response.getNoOfFullTimeEmp()));
				detail.setTypeOfClient(MessageUtil.getStringValueFromPOJO(response.getTypeOfClient()));
			 */
		} else {
			//header.setResponseCode(String.valueOf(CommonConstant.AR_RAHNU_HOST_BAD_RESPCODE));
			//header.setErrorCode(response.getErrorCode());
			//header.setErrorMsg(MessageUtil.getStringValueFromPOJO(response.getErrorMsg()));
			//header.setReasonCode(MessageUtil.getStringValueFromPOJO(String.valueOf(response.getReasonCode())));
		}	

		//detail.setCustNo(String.valueOf(message.getDetail().getCustNo()));

		//cifDetInqResponse.setHeader(header);
		cifDetInqResponse.setDetail(detail);

		return cifDetInqResponse;				
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

	public boolean validateHostResponse(byte[] responseData) throws Exception {

		byte[] responseCode = new byte[2];
		System.arraycopy(responseData, CommonConstant.MBASE_RESPCODE_INDEX_POSITION_CONSTANT, responseCode, 0, 2);
		String resCode = new String(responseCode, CommonConstant.EBCDIC_CCSID_VALUE);

		if (CommonConstant.RESPCODE_AA_VALUE.equals(resCode))
			return true;
		else
			return false;
	}

	
}
