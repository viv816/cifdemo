package com.beans.banking.esb.cifdetail.pojo;

import java.math.BigInteger;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class CifDetailHostDetail {
	
	@NotNull
	@Digits(fraction = 0, integer = 19)
	BigInteger	CustNo;
	
	@Digits(fraction = 0, integer = 2)
	BigInteger	BankNo;
	
	@Max(40)
	String	IDNo1;
	
	@Max(40)
	String	IDNo2;
	
	
	@Max(3)
	String	IDType;
	
	@Digits(fraction = 0, integer = 2)
	BigInteger	BranchNo;
	
	
	@Max(1)
	String	CIFGrpCode;
	
	@Max(40)
	
	String	LegalName1;
	
	@Max(40)
	String	LegalName2;
	
	
	@Max(40)
	String	PrefName1;
	
	@Max(40)
	String	PrefName2;
	
	@Max(1)	
	String	Class1;
	
	
	@Max(2)
	String	BNMSecCode;
	
	@Digits(fraction = 0, integer = 6)	
	BigInteger	BirthDate;
	
	
	@Max(3)
	String	Race;
		
	@Digits(fraction = 0, integer = 1)
	BigInteger	FedWHCode;
	
	@Max(1)
	String	CustType;
	
	@Max(3 )
	String	CitizenshipCountry;
	
	@Max(40)
	String	HRAddLine1;
	
	@Max(40)
	String	HRAddLine2;
	
	@Max(40)
	String	HRAddLine3;
	
	@Max(40)
	String	HRAddLine4;
	
	
	@Digits(fraction = 0, integer = 9)
	BigInteger	HRPostCode;
	
	@Max(40)
	String	CorrAddLine1;
	
	@Max(40)
	String	CorrAddLine2;
	
	@Max(40)
	String	CorrAddLine3;
	
	@Max(40)
	String	CorrAddLine4;
	
	@Digits(fraction = 0, integer = 9)
	BigInteger	CorrPostCode;
	
	
	@Digits(fraction = 2, integer = 15)
	Double	Income;
	
	@Digits(fraction = 0, integer = 6)
	BigInteger	EmpStartDate;
	
	@Max(3)
	String	LangID;
	
	@Max(30)
	String	ElecAddOff;
	
	@Max(30)
	String	ElecAddHome;
	
	@Max(30)
	String	ElecAddHP;
	
	@Max(30)
	String	ElecAddFaxNo;
	
	@Digits(fraction = 0, integer = 6)
	BigInteger	OriCustDate;
	
	@Max(1)
	String	HouseOwnCode;
	
	@Digits(fraction = 0, integer = 3)
	BigInteger	PresentAddStayDur;
	
	@Digits(fraction = 0, integer = 6)
	BigInteger	LastMaintenanceDate;
	
	
	@Digits(fraction = 2, integer = 15)
	Double	MonthlyInc;
	
	@Max(30)
	String	ElecAddEmail;
	
	@Max(5)
	String	JobDesCode;
	
	@Max(40)
	String	MotherMaidenName;
	
	@Max(1)
	String	BlacklistFlag;
	
	@Max(2)
	String	OwnRel;
	
	@Max(25)
	String	Salutation;
	
	@Max(1)
	String	Gender;
	
	@Max(1)
	String	MaritalStatCode;
	
	@Max(1)
	String	RelCode;
	
	@Max(1)
	String	EduLevel;
	
	@Max(40)
	String	EmpName;
	
	@Max(1)
	String	BizType;

	public BigInteger getCustNo() {
		return CustNo;
	}

	public void setCustNo(BigInteger custNo) {
		CustNo = custNo;
	}

	public BigInteger getBankNo() {
		return BankNo;
	}

	public void setBankNo(BigInteger bankNo) {
		BankNo = bankNo;
	}

	public String getIDNo1() {
		return IDNo1;
	}

	public void setIDNo1(String iDNo1) {
		IDNo1 = iDNo1;
	}

	public String getIDNo2() {
		return IDNo2;
	}

	public void setIDNo2(String iDNo2) {
		IDNo2 = iDNo2;
	}

	public String getIDType() {
		return IDType;
	}

	public void setIDType(String iDType) {
		IDType = iDType;
	}

	public BigInteger getBranchNo() {
		return BranchNo;
	}

	public void setBranchNo(BigInteger branchNo) {
		BranchNo = branchNo;
	}

	public String getCIFGrpCode() {
		return CIFGrpCode;
	}

	public void setCIFGrpCode(String cIFGrpCode) {
		CIFGrpCode = cIFGrpCode;
	}

	public String getLegalName1() {
		return LegalName1;
	}

	public void setLegalName1(String legalName1) {
		LegalName1 = legalName1;
	}

	public String getLegalName2() {
		return LegalName2;
	}

	public void setLegalName2(String legalName2) {
		LegalName2 = legalName2;
	}

	public String getPrefName1() {
		return PrefName1;
	}

	public void setPrefName1(String prefName1) {
		PrefName1 = prefName1;
	}

	public String getPrefName2() {
		return PrefName2;
	}

	public void setPrefName2(String prefName2) {
		PrefName2 = prefName2;
	}

	public String getClass1() {
		return Class1;
	}

	public void setClass1(String class1) {
		Class1 = class1;
	}

	public String getBNMSecCode() {
		return BNMSecCode;
	}

	public void setBNMSecCode(String bNMSecCode) {
		BNMSecCode = bNMSecCode;
	}

	public BigInteger getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(BigInteger birthDate) {
		BirthDate = birthDate;
	}

	public String getRace() {
		return Race;
	}

	public void setRace(String race) {
		Race = race;
	}

	public BigInteger getFedWHCode() {
		return FedWHCode;
	}

	public void setFedWHCode(BigInteger fedWHCode) {
		FedWHCode = fedWHCode;
	}

	public String getCustType() {
		return CustType;
	}

	public void setCustType(String custType) {
		CustType = custType;
	}

	public String getCitizenshipCountry() {
		return CitizenshipCountry;
	}

	public void setCitizenshipCountry(String citizenshipCountry) {
		CitizenshipCountry = citizenshipCountry;
	}

	public String getHRAddLine1() {
		return HRAddLine1;
	}

	public void setHRAddLine1(String hRAddLine1) {
		HRAddLine1 = hRAddLine1;
	}

	public String getHRAddLine2() {
		return HRAddLine2;
	}

	public void setHRAddLine2(String hRAddLine2) {
		HRAddLine2 = hRAddLine2;
	}

	public String getHRAddLine3() {
		return HRAddLine3;
	}

	public void setHRAddLine3(String hRAddLine3) {
		HRAddLine3 = hRAddLine3;
	}

	public String getHRAddLine4() {
		return HRAddLine4;
	}

	public void setHRAddLine4(String hRAddLine4) {
		HRAddLine4 = hRAddLine4;
	}

	public BigInteger getHRPostCode() {
		return HRPostCode;
	}

	public void setHRPostCode(BigInteger hRPostCode) {
		HRPostCode = hRPostCode;
	}

	public String getCorrAddLine1() {
		return CorrAddLine1;
	}

	public void setCorrAddLine1(String corrAddLine1) {
		CorrAddLine1 = corrAddLine1;
	}

	public String getCorrAddLine2() {
		return CorrAddLine2;
	}

	public void setCorrAddLine2(String corrAddLine2) {
		CorrAddLine2 = corrAddLine2;
	}

	public String getCorrAddLine3() {
		return CorrAddLine3;
	}

	public void setCorrAddLine3(String corrAddLine3) {
		CorrAddLine3 = corrAddLine3;
	}

	public String getCorrAddLine4() {
		return CorrAddLine4;
	}

	public void setCorrAddLine4(String corrAddLine4) {
		CorrAddLine4 = corrAddLine4;
	}

	public BigInteger getCorrPostCode() {
		return CorrPostCode;
	}

	public void setCorrPostCode(BigInteger corrPostCode) {
		CorrPostCode = corrPostCode;
	}

	public Double getIncome() {
		return Income;
	}

	public void setIncome(Double income) {
		Income = income;
	}

	public BigInteger getEmpStartDate() {
		return EmpStartDate;
	}

	public void setEmpStartDate(BigInteger empStartDate) {
		EmpStartDate = empStartDate;
	}

	public String getLangID() {
		return LangID;
	}

	public void setLangID(String langID) {
		LangID = langID;
	}

	public String getElecAddOff() {
		return ElecAddOff;
	}

	public void setElecAddOff(String elecAddOff) {
		ElecAddOff = elecAddOff;
	}

	public String getElecAddHome() {
		return ElecAddHome;
	}

	public void setElecAddHome(String elecAddHome) {
		ElecAddHome = elecAddHome;
	}

	public String getElecAddHP() {
		return ElecAddHP;
	}

	public void setElecAddHP(String elecAddHP) {
		ElecAddHP = elecAddHP;
	}

	public String getElecAddFaxNo() {
		return ElecAddFaxNo;
	}

	public void setElecAddFaxNo(String elecAddFaxNo) {
		ElecAddFaxNo = elecAddFaxNo;
	}

	public BigInteger getOriCustDate() {
		return OriCustDate;
	}

	public void setOriCustDate(BigInteger oriCustDate) {
		OriCustDate = oriCustDate;
	}

	public String getHouseOwnCode() {
		return HouseOwnCode;
	}

	public void setHouseOwnCode(String houseOwnCode) {
		HouseOwnCode = houseOwnCode;
	}

	public BigInteger getPresentAddStayDur() {
		return PresentAddStayDur;
	}

	public void setPresentAddStayDur(BigInteger presentAddStayDur) {
		PresentAddStayDur = presentAddStayDur;
	}

	public BigInteger getLastMaintenanceDate() {
		return LastMaintenanceDate;
	}

	public void setLastMaintenanceDate(BigInteger lastMaintenanceDate) {
		LastMaintenanceDate = lastMaintenanceDate;
	}

	public Double getMonthlyInc() {
		return MonthlyInc;
	}

	public void setMonthlyInc(Double monthlyInc) {
		MonthlyInc = monthlyInc;
	}

	public String getElecAddEmail() {
		return ElecAddEmail;
	}

	public void setElecAddEmail(String elecAddEmail) {
		ElecAddEmail = elecAddEmail;
	}

	public String getJobDesCode() {
		return JobDesCode;
	}

	public void setJobDesCode(String jobDesCode) {
		JobDesCode = jobDesCode;
	}

	public String getMotherMaidenName() {
		return MotherMaidenName;
	}

	public void setMotherMaidenName(String motherMaidenName) {
		MotherMaidenName = motherMaidenName;
	}

	public String getBlacklistFlag() {
		return BlacklistFlag;
	}

	public void setBlacklistFlag(String blacklistFlag) {
		BlacklistFlag = blacklistFlag;
	}

	public String getOwnRel() {
		return OwnRel;
	}

	public void setOwnRel(String ownRel) {
		OwnRel = ownRel;
	}

	public String getSalutation() {
		return Salutation;
	}

	public void setSalutation(String salutation) {
		Salutation = salutation;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getMaritalStatCode() {
		return MaritalStatCode;
	}

	public void setMaritalStatCode(String maritalStatCode) {
		MaritalStatCode = maritalStatCode;
	}

	public String getRelCode() {
		return RelCode;
	}

	public void setRelCode(String relCode) {
		RelCode = relCode;
	}

	public String getEduLevel() {
		return EduLevel;
	}

	public void setEduLevel(String eduLevel) {
		EduLevel = eduLevel;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getBizType() {
		return BizType;
	}

	public void setBizType(String bizType) {
		BizType = bizType;
	}
	
	

}
