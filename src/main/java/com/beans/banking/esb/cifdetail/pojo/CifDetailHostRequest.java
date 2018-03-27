package com.beans.banking.esb.cifdetail.pojo;


import java.math.BigInteger;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CifDetailHostRequest {
	
//	@NotNull
//	@Size(max = 3)
//	private String EAIMsgVerNo;
//	
//	@NotNull
//	@Size(max = 10)
//	private String EAITransType;
//	
//	@NotNull
//	@Size(max = 4)
//	private String EAIApplName;
//	
//	@NotNull
//	@Size(max = 4)
//	private String EAIApplID;
//	
//	private String EAIApplTransID;
//	
//	@NotNull
//	@Size(max = 6)
//	private String EAITransDate;
//	
//	private String EAITransTime;
//	
//	private String EAITransUserID;
//	
//	private String EAITransUserInfo;
//	
//	private String EAIApplUserID;
//	
//	private String EAIBankCode;
//	
//	private String EAIBranchNo;
//	
//	@NotNull
//	@Size(max = 2)
//	private String EAIControlUnit;
//	
//	@NotNull
//	@Size(max = 10)
//	private String TellerID;
	
	@NotNull
	@Digits(integer = 19, fraction = 0)
	private BigInteger CustNo;

//	public String getEAIMsgVerNo() {
//		return EAIMsgVerNo;
//	}
//
//	public void setEAIMsgVerNo(String eAIMsgVerNo) {
//		EAIMsgVerNo = eAIMsgVerNo;
//	}
//
//	public String getEAITransType() {
//		return EAITransType;
//	}
//
//	public void setEAITransType(String eAITransType) {
//		EAITransType = eAITransType;
//	}
//
//	public String getEAIApplName() {
//		return EAIApplName;
//	}
//
//	public void setEAIApplName(String eAIApplName) {
//		EAIApplName = eAIApplName;
//	}
//
//	public String getEAIApplID() {
//		return EAIApplID;
//	}
//
//	public void setEAIApplID(String eAIApplID) {
//		EAIApplID = eAIApplID;
//	}
//
//	public String getEAIApplTransID() {
//		return EAIApplTransID;
//	}
//
//	public void setEAIApplTransID(String eAIApplTransID) {
//		EAIApplTransID = eAIApplTransID;
//	}
//
//	public String getEAITransDate() {
//		return EAITransDate;
//	}
//
//	public void setEAITransDate(String eAITransDate) {
//		EAITransDate = eAITransDate;
//	}
//
//	public String getEAITransTime() {
//		return EAITransTime;
//	}
//
//	public void setEAITransTime(String eAITransTime) {
//		EAITransTime = eAITransTime;
//	}
//
//	public String getEAITransUserID() {
//		return EAITransUserID;
//	}
//
//	public void setEAITransUserID(String eAITransUserID) {
//		EAITransUserID = eAITransUserID;
//	}
//
//	public String getEAITransUserInfo() {
//		return EAITransUserInfo;
//	}
//
//	public void setEAITransUserInfo(String eAITransUserInfo) {
//		EAITransUserInfo = eAITransUserInfo;
//	}
//
//	public String getEAIApplUserID() {
//		return EAIApplUserID;
//	}
//
//	public void setEAIApplUserID(String eAIApplUserID) {
//		EAIApplUserID = eAIApplUserID;
//	}
//
//	public String getEAIBankCode() {
//		return EAIBankCode;
//	}
//
//	public void setEAIBankCode(String eAIBankCode) {
//		EAIBankCode = eAIBankCode;
//	}
//
//	public String getEAIBranchNo() {
//		return EAIBranchNo;
//	}
//
//	public void setEAIBranchNo(String eAIBranchNo) {
//		EAIBranchNo = eAIBranchNo;
//	}
//
//	public String getEAIControlUnit() {
//		return EAIControlUnit;
//	}
//
//	public void setEAIControlUnit(String eAIControlUnit) {
//		EAIControlUnit = eAIControlUnit;
//	}
//
//	public String getTellerID() {
//		return TellerID;
//	}
//
//	public void setTellerID(String tellerID) {
//		TellerID = tellerID;
//	}

	public BigInteger getCustNo() {
		return CustNo;
	}

	public void setCustNo(BigInteger custNo) {
		CustNo = custNo;
	}

	@Override
	public String toString() {
		return "CifDetailHostRequest [CustNo=" + CustNo + "]";
	}
}
