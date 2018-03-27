package com.beans.banking.esb.cifdetail.pojo;

import com.beans.banking.esb.util.MessageUtil;

public class CifDetailHostResponse {

	private String MSGLENGTH = "";
	private String SKTMLEN = "";
	private String SKTHEAD = "";
	private String SKTDEV = "";
	private String SKTFILL = "";
	private String I13HLEN = "";
	private String I13MLEN = "";
	private String I13VERS = "";
	private String I13HFMID = "";
	private String I13FMID = "";
	private String I13SID = "";
	private String I13SSNO = "";
	private String I13TMNO = "";
	private String I13NREC = "";
	private String I13NERR = "";
	private String I13TTYP = "";
	private String HDRIND = "";
	private String HDUSID = "";
	private long HDRNUM = 0;
	private long HDRBID = 0;
	private String HDEGPI = "";
	private long HDBMSG = 0;
	private String HDSRID = "";
	private String HDDSID = "";
	private String HDRTDQ = "";
	private String HDTMID = "";
	private long HDBKNO = 0;
	private long HDBRNO = 0;
	private String HDRSID = "";
	private String HDTSID = "";
	private String HDHSID = "";
	private long HDTXCD = 0;
	private String HDACCD = "";
	private String HDTMOD = "";
	private long HDNREC = 0;
	private String HDMREC = "";
	private String HDSMTD = "";
	private String HDRCD1 = "";
	private String HDRRE1 = "";
	private String HDRCD2 = "";
	private String HDRRE2 = "";
	private String HDRCD3 = "";
	private String HDRRE3 = "";
	private String HDRCD4 = "";
	private String HDRRE4 = "";
	private String HDRCD5 = "";
	private String HDRRE5 = "";
	private long HDDTIN = 0;
	private long HDTMIN = 0;
	private long HDACTN = 0;
	private String HDACTY = "";
	private long HDCIFN = 0;
	private String HDFILR = "";
	
	private String custNumber;
	private String custNumb;
	private String bankNo;
	private String idNo1;
	private String idNo2;
	private String idType;
	private String branchNo;
	private String cifGrpCode;
	private String legalName1;
	private String legalName2;
	private String prefName1;
	private String prefName2;
	private String cfClass;
	private String bnmSecCode;
	private String birthDate;
	private String race;
	private String fedWHCode;
	private String custType;
	private String citizenCountry;
	private String hrAddLine1;
	private String hrAddLine2;
	private String hrAddLine3;
	private String hrAddLine4;
	private String hrAddLinePostCode;
	private String corrAddLine1;
	private String corrAddLine2;
	private String corrAddLine3;
	private String corrAddLine4;
	private String corrPostCode;
	private String income;
	private String empStart;
	private String langID;
	private String elecAddOff;
	private String elecAddHome;
	private String elecAddHP;
	private String elecAddFaxNo;
	private String oriCustDate;
	private String houseOwnerCode;
	private String presentAddStayDur;
	private String lastMaintDate;
	private String monthlyInc;
	private String elecAddEmail;
	private String jobDesCode;
	private String motherMaidenName;
	private String blacklistFlag;
	private String ownRel;
	private String salutation;
	private String gender;
	private String maritalStatCode;
	private String relCode;
	private String eduLevel;
	private String empName;
	private String bizType;
	private String incomeBracketCode;
	
	private String errorCode;
	private String errorMsg;
	private String reasonCode;
	private int responseCode;
	private String filler;
	
	public String getMSGLENGTH() {
		return MSGLENGTH;
	}
	public void setMSGLENGTH(String mSGLENGTH) {
		MSGLENGTH = mSGLENGTH;
	}
	public String getSKTMLEN() {
		return SKTMLEN;
	}
	public void setSKTMLEN(String sKTMLEN) {
		SKTMLEN = sKTMLEN;
	}
	public String getSKTHEAD() {
		return SKTHEAD;
	}
	public void setSKTHEAD(String sKTHEAD) {
		SKTHEAD = sKTHEAD;
	}
	public String getSKTDEV() {
		return SKTDEV;
	}
	public void setSKTDEV(String sKTDEV) {
		SKTDEV = sKTDEV;
	}
	public String getSKTFILL() {
		return SKTFILL;
	}
	public void setSKTFILL(String sKTFILL) {
		SKTFILL = sKTFILL;
	}
	public String getI13HLEN() {
		return I13HLEN;
	}
	public void setI13HLEN(String i13hlen) {
		I13HLEN = i13hlen;
	}
	public String getI13MLEN() {
		return I13MLEN;
	}
	public void setI13MLEN(String i13mlen) {
		I13MLEN = i13mlen;
	}
	public String getI13VERS() {
		return I13VERS;
	}
	public void setI13VERS(String i13vers) {
		I13VERS = i13vers;
	}
	public String getI13HFMID() {
		return I13HFMID;
	}
	public void setI13HFMID(String i13hfmid) {
		I13HFMID = i13hfmid;
	}
	public String getI13FMID() {
		return I13FMID;
	}
	public void setI13FMID(String i13fmid) {
		I13FMID = i13fmid;
	}
	public String getI13SID() {
		return I13SID;
	}
	public void setI13SID(String i13sid) {
		I13SID = i13sid;
	}
	public String getI13SSNO() {
		return I13SSNO;
	}
	public void setI13SSNO(String i13ssno) {
		I13SSNO = i13ssno;
	}
	public String getI13TMNO() {
		return I13TMNO;
	}
	public void setI13TMNO(String i13tmno) {
		I13TMNO = i13tmno;
	}
	public String getI13NREC() {
		return I13NREC;
	}
	public void setI13NREC(String i13nrec) {
		I13NREC = i13nrec;
	}
	public String getI13NERR() {
		return I13NERR;
	}
	public void setI13NERR(String i13nerr) {
		I13NERR = i13nerr;
	}
	public String getI13TTYP() {
		return I13TTYP;
	}
	public void setI13TTYP(String i13ttyp) {
		I13TTYP = i13ttyp;
	}
	public String getHDRIND() {
		return HDRIND;
	}
	public void setHDRIND(String hDRIND) {
		HDRIND = hDRIND;
	}
	public String getHDUSID() {
		return HDUSID;
	}
	public void setHDUSID(String hDUSID) {
		HDUSID = hDUSID;
	}
	public long getHDRNUM() {
		return HDRNUM;
	}
	public void setHDRNUM(long hDRNUM) {
		HDRNUM = hDRNUM;
	}
	public long getHDRBID() {
		return HDRBID;
	}
	public void setHDRBID(long hDRBID) {
		HDRBID = hDRBID;
	}
	public String getHDEGPI() {
		return HDEGPI;
	}
	public void setHDEGPI(String hDEGPI) {
		HDEGPI = hDEGPI;
	}
	public long getHDBMSG() {
		return HDBMSG;
	}
	public void setHDBMSG(long hDBMSG) {
		HDBMSG = hDBMSG;
	}
	public String getHDSRID() {
		return HDSRID;
	}
	public void setHDSRID(String hDSRID) {
		HDSRID = hDSRID;
	}
	public String getHDDSID() {
		return HDDSID;
	}
	public void setHDDSID(String hDDSID) {
		HDDSID = hDDSID;
	}
	public String getHDRTDQ() {
		return HDRTDQ;
	}
	public void setHDRTDQ(String hDRTDQ) {
		HDRTDQ = hDRTDQ;
	}
	public String getHDTMID() {
		return HDTMID;
	}
	public void setHDTMID(String hDTMID) {
		HDTMID = hDTMID;
	}
	public long getHDBKNO() {
		return HDBKNO;
	}
	public void setHDBKNO(long hDBKNO) {
		HDBKNO = hDBKNO;
	}
	public long getHDBRNO() {
		return HDBRNO;
	}
	public void setHDBRNO(long hDBRNO) {
		HDBRNO = hDBRNO;
	}
	public String getHDRSID() {
		return HDRSID;
	}
	public void setHDRSID(String hDRSID) {
		HDRSID = hDRSID;
	}
	public String getHDTSID() {
		return HDTSID;
	}
	public void setHDTSID(String hDTSID) {
		HDTSID = hDTSID;
	}
	public String getHDHSID() {
		return HDHSID;
	}
	public void setHDHSID(String hDHSID) {
		HDHSID = hDHSID;
	}
	public long getHDTXCD() {
		return HDTXCD;
	}
	public void setHDTXCD(long hDTXCD) {
		HDTXCD = hDTXCD;
	}
	public String getHDACCD() {
		return HDACCD;
	}
	public void setHDACCD(String hDACCD) {
		HDACCD = hDACCD;
	}
	public String getHDTMOD() {
		return HDTMOD;
	}
	public void setHDTMOD(String hDTMOD) {
		HDTMOD = hDTMOD;
	}
	public long getHDNREC() {
		return HDNREC;
	}
	public void setHDNREC(long hDNREC) {
		HDNREC = hDNREC;
	}
	public String getHDMREC() {
		return HDMREC;
	}
	public void setHDMREC(String hDMREC) {
		HDMREC = hDMREC;
	}
	public String getHDSMTD() {
		return HDSMTD;
	}
	public void setHDSMTD(String hDSMTD) {
		HDSMTD = hDSMTD;
	}
	public String getHDRCD1() {
		return HDRCD1;
	}
	public void setHDRCD1(String hDRCD1) {
		HDRCD1 = hDRCD1;
	}
	public String getHDRRE1() {
		return HDRRE1;
	}
	public void setHDRRE1(String hDRRE1) {
		HDRRE1 = hDRRE1;
	}
	public String getHDRCD2() {
		return HDRCD2;
	}
	public void setHDRCD2(String hDRCD2) {
		HDRCD2 = hDRCD2;
	}
	public String getHDRRE2() {
		return HDRRE2;
	}
	public void setHDRRE2(String hDRRE2) {
		HDRRE2 = hDRRE2;
	}
	public String getHDRCD3() {
		return HDRCD3;
	}
	public void setHDRCD3(String hDRCD3) {
		HDRCD3 = hDRCD3;
	}
	public String getHDRRE3() {
		return HDRRE3;
	}
	public void setHDRRE3(String hDRRE3) {
		HDRRE3 = hDRRE3;
	}
	public String getHDRCD4() {
		return HDRCD4;
	}
	public void setHDRCD4(String hDRCD4) {
		HDRCD4 = hDRCD4;
	}
	public String getHDRRE4() {
		return HDRRE4;
	}
	public void setHDRRE4(String hDRRE4) {
		HDRRE4 = hDRRE4;
	}
	public String getHDRCD5() {
		return HDRCD5;
	}
	public void setHDRCD5(String hDRCD5) {
		HDRCD5 = hDRCD5;
	}
	public String getHDRRE5() {
		return HDRRE5;
	}
	public void setHDRRE5(String hDRRE5) {
		HDRRE5 = hDRRE5;
	}
	public long getHDDTIN() {
		return HDDTIN;
	}
	public void setHDDTIN(long hDDTIN) {
		HDDTIN = hDDTIN;
	}
	public long getHDTMIN() {
		return HDTMIN;
	}
	public void setHDTMIN(long hDTMIN) {
		HDTMIN = hDTMIN;
	}
	public long getHDACTN() {
		return HDACTN;
	}
	public void setHDACTN(long hDACTN) {
		HDACTN = hDACTN;
	}
	public String getHDACTY() {
		return HDACTY;
	}
	public void setHDACTY(String hDACTY) {
		HDACTY = hDACTY;
	}
	public long getHDCIFN() {
		return HDCIFN;
	}
	public void setHDCIFN(long hDCIFN) {
		HDCIFN = hDCIFN;
	}
	public String getHDFILR() {
		return HDFILR;
	}
	public void setHDFILR(String hDFILR) {
		HDFILR = hDFILR;
	}
	
	
	public String getCustNumber() {
		return custNumber;
	}
	public void setCustNumber(String custNumber) {
		this.custNumber = custNumber;
	}
	public String getCustNumb() {
		return custNumb;
	}
	public void setCustNumb(String custNumb) {
		this.custNumb = custNumb;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getIdNo1() {
		if(idNo1 != null && !idNo1.equals("")) {
			return MessageUtil.escapeXml(idNo1);
		}else{
			return "";
		}
	}
	public void setIdNo1(String idNo1) {
		this.idNo1 = idNo1;
	}
	public String getIdNo2() {
		if(idNo2 != null && !idNo2.equals("")) {
			return MessageUtil.escapeXml(idNo2);
		}else{
			return "";
		}
	}
	public void setIdNo2(String idNo2) {
		this.idNo2 = idNo2;
	}
	public String getIdType() {
		if(idType != null && !idType.equals("")) {
			return MessageUtil.escapeXml(idType);
		}else{
			return "";
		}
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getBranchNo() {
		return branchNo;
	}
	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}
	public String getCifGrpCode() {
		if(cifGrpCode != null && !cifGrpCode.equals("")) {
			return MessageUtil.escapeXml(cifGrpCode);
		}else{
			return "";
		}
	}
	public void setCifGrpCode(String cifGrpCode) {
		this.cifGrpCode = cifGrpCode;
	}
	public String getLegalName1() {
		if(legalName1 != null && !legalName1.equals("")) {
			return MessageUtil.escapeXml(legalName1);
		}else{
			return "";
		}
	}
	public void setLegalName1(String legalName1) {
		this.legalName1 = legalName1;
	}
	public String getLegalName2() {
		if(legalName2 != null && !legalName2.equals("")) {
			return MessageUtil.escapeXml(legalName2);
		}else{
			return "";
		}
	}
	public void setLegalName2(String legalName2) {
		this.legalName2 = legalName2;
	}
	public String getPrefName1() {
		if(prefName1 != null && !prefName1.equals("")) {
			return MessageUtil.escapeXml(prefName1);
		}else{
			return "";
		}
	}
	public void setPrefName1(String prefName1) {
		this.prefName1 = prefName1;
	}
	public String getPrefName2() {
		if(prefName2 != null && !prefName2.equals("")) {
			return MessageUtil.escapeXml(prefName2);
		}else{
			return "";
		}
	}
	public void setPrefName2(String prefName2) {
		this.prefName2 = prefName2;
	}
	public String getCFClass() {
		if(cfClass != null && !cfClass.equals("")) {
			return MessageUtil.escapeXml(cfClass);
		}else{
			return "";
		}
	}
	public void setCFClass(String cfClass) {
		this.cfClass = cfClass;
	}
	public String getBnmSecCode() {
		if(bnmSecCode != null && !bnmSecCode.equals("")) {
			return MessageUtil.escapeXml(bnmSecCode);
		}else{
			return "";
		}
	}
	public void setBnmSecCode(String bnmSecCode) {
		this.bnmSecCode = bnmSecCode;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getRace() {
		if(race != null && !race.equals("")) {
			return MessageUtil.escapeXml(race);
		}else{
			return "";
		}
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getFedWHCode() {
		return fedWHCode;
	}
	public void setFedWHCode(String fedWHCode) {
		this.fedWHCode = fedWHCode;
	}
	public String getCustType() {
		if(custType != null && !custType.equals("")) {
			return MessageUtil.escapeXml(custType);
		}else{
			return "";
		}
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getCitizenCountry() {
		if(citizenCountry != null && !citizenCountry.equals("")) {
			return MessageUtil.escapeXml(citizenCountry);
		}else{
			return "";
		}
	}
	public void setCitizenCountry(String citizenCountry) {
		this.citizenCountry = citizenCountry;
	}
	public String getHrAddLine1() {
		if(hrAddLine1 != null && !hrAddLine1.equals("")) {
			return MessageUtil.escapeXml(hrAddLine1);
		}else{
			return "";
		}
	}
	public void setHrAddLine1(String hrAddLine1) {
		this.hrAddLine1 = hrAddLine1;
	}
	public String getHrAddLine2() {
		if(hrAddLine2 != null && !hrAddLine2.equals("")) {
			return MessageUtil.escapeXml(hrAddLine2);
		}else{
			return "";
		}
	}
	public void setHrAddLine2(String hrAddLine2) {
		this.hrAddLine2 = hrAddLine2;
	}
	public String getHrAddLine3() {
		if(hrAddLine3 != null && !hrAddLine3.equals("")) {
			return MessageUtil.escapeXml(hrAddLine3);
		}else{
			return "";
		}
	}
	public void setHrAddLine3(String hrAddLine3) {
		this.hrAddLine3 = hrAddLine3;
	}
	public String getHrAddLine4() {
		if(hrAddLine4 != null && !hrAddLine4.equals("")) {
			return MessageUtil.escapeXml(hrAddLine4);
		}else{
			return "";
		}
	}
	public void setHrAddLine4(String hrAddLine4) {
		this.hrAddLine4 = hrAddLine4;
	}
	public String getHrAddLinePostCode() {
		return hrAddLinePostCode;
	}
	public void setHrAddLinePostCode(String hrAddLinePostCode) {
		this.hrAddLinePostCode = hrAddLinePostCode;
	}
	public String getCorrAddLine1() {
		if(corrAddLine1 != null && !corrAddLine1.equals("")) {
			return MessageUtil.escapeXml(corrAddLine1);
		}else{
			return "";
		}
	}
	public void setCorrAddLine1(String corrAddLine1) {
		this.corrAddLine1 = corrAddLine1;
	}
	public String getCorrAddLine2() {
		if(corrAddLine2 != null && !corrAddLine2.equals("")) {
			return MessageUtil.escapeXml(corrAddLine2);
		}else{
			return "";
		}
	}
	public void setCorrAddLine2(String corrAddLine2) {
		this.corrAddLine2 = corrAddLine2;
	}
	public String getCorrAddLine3() {
		if(corrAddLine3 != null && !corrAddLine3.equals("")) {
			return MessageUtil.escapeXml(corrAddLine3);
		}else{
			return "";
		}
	}
	public void setCorrAddLine3(String corrAddLine3) {
		this.corrAddLine3 = corrAddLine3;
	}
	public String getCorrAddLine4() {
		if(corrAddLine4 != null && !corrAddLine4.equals("")) {
			return MessageUtil.escapeXml(corrAddLine4);
		}else{
			return "";
		}
	}
	public void setCorrAddLine4(String corrAddLine4) {
		this.corrAddLine4 = corrAddLine4;
	}
	public String getCorrPostCode() {
		return corrPostCode;
	}
	public void setCorrPostCode(String corrPostCode) {
		this.corrPostCode = corrPostCode;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public String getEmpStart() {
		return empStart;
	}
	public void setEmpStart(String empStart) {
		this.empStart = empStart;
	}
	public String getLangID() {
		if(langID != null && !langID.equals("")) {
			return MessageUtil.escapeXml(langID);
		}else{
			return "";
		}	
	}
	public void setLangID(String langID) {
		this.langID = langID;
	}
	public String getElecAddOff() {
		if(elecAddOff != null && !elecAddOff.equals("")) {
			return MessageUtil.escapeXml(elecAddOff);
		}else{
			return "";
		}	
	}
	public void setElecAddOff(String elecAddOff) {
		this.elecAddOff = elecAddOff;
	}
	public String getElecAddHome() {
		if(elecAddHome != null && !elecAddHome.equals("")) {
			return MessageUtil.escapeXml(elecAddHome);
		}else{
			return "";
		}
	}
	public void setElecAddHome(String elecAddHome) {
		this.elecAddHome = elecAddHome;
	}
	public String getElecAddHP() {
		if(elecAddHP != null && !elecAddHP.equals("")) {
			return MessageUtil.escapeXml(elecAddHP);
		}else{
			return "";
		}		
	}
	public void setElecAddHP(String elecAddHP) {
		this.elecAddHP = elecAddHP;
	}
	public String getElecAddFaxNo() {
		if(elecAddFaxNo != null && !elecAddFaxNo.equals("")) {
			return MessageUtil.escapeXml(elecAddFaxNo);
		}else{
			return "";
		}	
	}
	public void setElecAddFaxNo(String elecAddFaxNo) {
		this.elecAddFaxNo = elecAddFaxNo;
	}
	public String getOriCustDate() {
		return oriCustDate;
	}
	public void setOriCustDate(String oriCustDate) {
		this.oriCustDate = oriCustDate;
	}
	public String getHouseOwnerCode() {
		if(houseOwnerCode != null && !houseOwnerCode.equals("")) {
			return MessageUtil.escapeXml(houseOwnerCode);
		}else{
			return "";
		}		
	}
	public void setHouseOwnerCode(String houseOwnerCode) {
		this.houseOwnerCode = houseOwnerCode;
	}
	public String getPresentAddStayDur() {
		return presentAddStayDur;
	}
	public void setPresentAddStayDur(String presentAddStayDur) {
		this.presentAddStayDur = presentAddStayDur;
	}
	public String getLastMaintDate() {
		return lastMaintDate;
	}
	public void setLastMaintDate(String lastMaintDate) {
		this.lastMaintDate = lastMaintDate;
	}
	public String getMonthlyInc() {
		return monthlyInc;
	}
	public void setMonthlyInc(String monthlyInc) {
		this.monthlyInc = monthlyInc;
	}
	public String getElecAddEmail() {
		if(elecAddEmail != null && !elecAddEmail.equals("")) {
			return MessageUtil.escapeXml(elecAddEmail);
		}else{
			return "";
		}		
	}
	public void setElecAddEmail(String elecAddEmail) {
		this.elecAddEmail = elecAddEmail;
	}
	public String getJobDesCode() {
		if(jobDesCode != null && !jobDesCode.equals("")) {
			return MessageUtil.escapeXml(jobDesCode);
		}else{
			return "";
		}	
	}
	public void setJobDesCode(String jobDesCode) {
		this.jobDesCode = jobDesCode;
	}
	
	public String getMotherMaidenName() {
		if(motherMaidenName != null && !motherMaidenName.equals("")) {
			return MessageUtil.escapeXml(motherMaidenName);
		}else{
			return "";
		}
	}
	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}
	public String getBlacklistFlag() {
		if(blacklistFlag != null && !blacklistFlag.equals("")) {
			return MessageUtil.escapeXml(blacklistFlag);
		}else{
			return "";
		}
	}
	public void setBlacklistFlag(String blacklistFlag) {
		this.blacklistFlag = blacklistFlag;
	}
	public String getOwnRel() {
		if(ownRel != null && !ownRel.equals("")) {
			return MessageUtil.escapeXml(ownRel);
		}else{
			return "";
		}
	}
	public void setOwnRel(String ownRel) {
		this.ownRel = ownRel;
	}
	public String getSalutation() {
		if(salutation != null && !salutation.equals("")) {
			return MessageUtil.escapeXml(salutation);
		}else{
			return "";
		}
		
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getGender() {
		if(gender != null && !gender.equals("")) {
			return MessageUtil.escapeXml(gender);
		}else{
			return "";
		}
		
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatCode() {
		if(maritalStatCode != null && !maritalStatCode.equals("")) {
			return MessageUtil.escapeXml(maritalStatCode);
		}else{
			return "";
		}
	}
	public void setMaritalStatCode(String maritalStatCode) {
		this.maritalStatCode = maritalStatCode;
	}
	public String getRelCode() {
		if(relCode != null && !relCode.equals("")) {
			return MessageUtil.escapeXml(relCode);
		}else{
			return "";
		}
		
	}
	public void setRelCode(String relCode) {
		this.relCode = relCode;
	}
	public String getEduLevel() {
		if(eduLevel != null && !eduLevel.equals("")) {
			return MessageUtil.escapeXml(eduLevel);
		}else{
			return "";
		}
		
	}
	public void setEduLevel(String eduLevel) {
		this.eduLevel = eduLevel;
	}
	public String getEmpName() {
		if(empName != null && !empName.equals("")) {
			return MessageUtil.escapeXml(empName);
		}else{
			return "";
		}
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getBizType() {
		if(bizType != null && !bizType.equals("")) {
			return MessageUtil.escapeXml(bizType);
		}else{
			return "";
		}
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getIncomeBracketCode() {
		if(incomeBracketCode != null && !incomeBracketCode.equals("")) {
			return MessageUtil.escapeXml(incomeBracketCode);
		}else{
			return "";
		}
	}
	public void setIncomeBracketCode(String incomeBracketCode) {
		this.incomeBracketCode = incomeBracketCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String erorrCode) {
		this.errorCode = erorrCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getFiller() {
		return filler;
	}
	public void setFiller(String filler) {
		this.filler = filler;
	}

	
}
