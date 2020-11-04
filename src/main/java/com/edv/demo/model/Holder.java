package com.edv.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="HOLDER")
public class Holder implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_HOLDER_PK")
	private Long idHolderPk;

    @Temporal(TemporalType.TIMESTAMP)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="DOCUMENT_NUMBER")
	private String documentNumber;

	@Column(name="DOCUMENT_TYPE")
	private Integer documentType;

	@Column(name="ECONOMIC_ACTIVITY")
	private Integer economicActivity;

	@Column(name="ECONOMIC_SECTOR")
	private Integer economicSector;

	@Column(name="FAX_NUMBER")
	private String faxNumber;

	@Column(name="FIRST_LAST_NAME")
	private String firstLastName;

	@Column(name="FULL_NAME")
	private String fullName;

	@Column(name="HOLDER_TYPE")
	private Integer holderType;
	
	@Column(name="JURIDIC_CLASS")
	private Integer juridicClass;

	@Column(name="IND_DISABLED")
	private Integer indDisabled;

	@Column(name="IND_RESIDENCE")
	private Integer indResidence;

	@Column(name="IND_MINOR")
	private Integer indMinor;
	
	@Column(name="LAST_MODIFY_APP")
	private Integer lastModifyApp;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="LAST_MODIFY_DATE")
	private Date lastModifyDate;

	@Column(name="LAST_MODIFY_IP")
	private String lastModifyIp;

	@Column(name="LAST_MODIFY_USER")
	private String lastModifyUser;

	@Column(name="LEGAL_ADDRESS")
	private String legalAddress;

	@Column(name="LEGAL_DEPARTMENT")
	private Integer legalDepartment;

	@Column(name="LEGAL_DISTRICT")
	private Integer legalDistrict;

	@Column(name="LEGAL_PROVINCE")
	private Integer legalProvince;

	@Column(name="LEGAL_RESIDENCE_COUNTRY")
	private Integer legalResidenceCountry;

	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name="Name")
	private String name;

	@Column(name="Nationality")
	private Integer nationality;

	@Column(name="HOME_PHONE_NUMBER")
	private String homePhoneNumber;
	
	@Column(name="OFFICE_PHONE_NUMBER")
	private String officePhoneNumber;

	@Column(name="POSTAL_ADDRESS")
	private String postalAddress;

	@Column(name="POSTAL_DEPARTMENT")
	private Integer postalDepartment;

	@Column(name="POSTAL_DISTRICT")
	private Integer postalDistrict;

	@Column(name="POSTAL_PROVINCE")
	private Integer postalProvince;

	@Column(name="POSTAL_RESIDENCE_COUNTRY")
	private Integer postalResidenceCountry;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="REGISTRY_DATE")
	private Date registryDate;

	@Column(name="REGISTRY_USER")
	private String registryUser;

	@Column(name="SECOND_DOCUMENT_NUMBER")
	private String secondDocumentNumber;

	@Column(name="SECOND_DOCUMENT_TYPE")
	private Integer secondDocumentType;

	@Column(name="SECOND_LAST_NAME")
	private String secondLastName;

	@Column(name="SECOND_NATIONALITY")
	private Integer secondNationality;

	@Column(name="STATE_HOLDER")
	private Integer stateHolder;

    @ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_PARTICIPANT_FK", referencedColumnName="ID_PARTICIPANT_PK")
	private Participant participant;
    
    @Column(name="DOCUMENT_SOURCE")
	private Integer documentSource;

    @Column(name="DOCUMENT_ISSUANCE_DATE")
    private Integer documentIssuanceDate;
   
    @Column(name="RELATED_CUI")
    private Long relatedCui;
    
    @Column(name="FUND_ADMINISTRATOR")
    private String fundAdministrator;
    
    @Column(name="FUND_TYPE")
    private String fundType;
    
    @Column(name="TRANSFER_NUMBER")
    private String transferNumber;
    
    @Column(name="MNEMONIC")
	private String mnemonic;
    
    @Column(name="MARRIED_LAST_NAME")
    private String marriedLastName;
    
    @Column(name="CIVIL_STATUS")
    private Integer civilStatus;
    
    @Column(name="MAIN_ACTIVITY")
    private String mainActivity;
    
    @Column(name="JOB_SOURCE_BUSINESS_NAME")
    private String jobSourceBusinessName;
    
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name="JOB_DATE_ADMISSION")
    private Date jobDateAdmission;
	
    @Column(name="APPOINTMENT")
    private String appointment;
	
    @Column(name="JOB_ADDRESS")
    private String jobAddress;
    
    @Column(name="TOTAL_INCOME")
    private Integer totalIncome;
    
    @Column(name="PER_REF_FULL_NAME")
    private String perRefFullName;
    
    @Column(name="PER_REF_LANDLINE")
    private String perRefLandLine;
    
    @Column(name="PER_REF_CELLPHONE")
    private String perRefCellPhone;
    
    @Column(name="COMER_REF_BUSINESS_NAME")
    private String comerRefBusinessName;
    
    @Column(name="COMER_REF_LANDLINE")
    private String comerRefLandLine;

    @Column(name="ENTITY_PUBLIC_APPOINTMENT")
    private String entityPublicAppointment;
    
    @Column(name="NIT_NATURAL_PERSON")
    private Integer nitNaturalPerson;
    
    @Column(name="WEBSITE")
	private String website;
    
    @Column(name="FUNDCOMPANY_ENROLLMENT")
    private String fundCompanyEnrollment;
    
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name="CONSTITUTION_DATE")
    private Date constitutionDate;
    
    @Lob()
   	@Column(name="FILE_PHOTO")
   	private byte[] filePhoto;
    
    @Lob()
   	@Column(name="FILE_SIGNING")
   	private byte[] fileSigning;
    
	@Column(name="IND_CAN_NEGOTIATE")
	private Integer indCanNegotiate;

	public Long getIdHolderPk() {
		return idHolderPk;
	}

	public void setIdHolderPk(Long idHolderPk) {
		this.idHolderPk = idHolderPk;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Integer getDocumentType() {
		return documentType;
	}

	public void setDocumentType(Integer documentType) {
		this.documentType = documentType;
	}

	public Integer getEconomicActivity() {
		return economicActivity;
	}

	public void setEconomicActivity(Integer economicActivity) {
		this.economicActivity = economicActivity;
	}

	public Integer getEconomicSector() {
		return economicSector;
	}

	public void setEconomicSector(Integer economicSector) {
		this.economicSector = economicSector;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getFirstLastName() {
		return firstLastName;
	}

	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getHolderType() {
		return holderType;
	}

	public void setHolderType(Integer holderType) {
		this.holderType = holderType;
	}

	public Integer getJuridicClass() {
		return juridicClass;
	}

	public void setJuridicClass(Integer juridicClass) {
		this.juridicClass = juridicClass;
	}

	public Integer getIndDisabled() {
		return indDisabled;
	}

	public void setIndDisabled(Integer indDisabled) {
		this.indDisabled = indDisabled;
	}

	public Integer getIndResidence() {
		return indResidence;
	}

	public void setIndResidence(Integer indResidence) {
		this.indResidence = indResidence;
	}

	public Integer getIndMinor() {
		return indMinor;
	}

	public void setIndMinor(Integer indMinor) {
		this.indMinor = indMinor;
	}

	public Integer getLastModifyApp() {
		return lastModifyApp;
	}

	public void setLastModifyApp(Integer lastModifyApp) {
		this.lastModifyApp = lastModifyApp;
	}

	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	public String getLastModifyIp() {
		return lastModifyIp;
	}

	public void setLastModifyIp(String lastModifyIp) {
		this.lastModifyIp = lastModifyIp;
	}

	public String getLastModifyUser() {
		return lastModifyUser;
	}

	public void setLastModifyUser(String lastModifyUser) {
		this.lastModifyUser = lastModifyUser;
	}

	public String getLegalAddress() {
		return legalAddress;
	}

	public void setLegalAddress(String legalAddress) {
		this.legalAddress = legalAddress;
	}

	public Integer getLegalDepartment() {
		return legalDepartment;
	}

	public void setLegalDepartment(Integer legalDepartment) {
		this.legalDepartment = legalDepartment;
	}

	public Integer getLegalDistrict() {
		return legalDistrict;
	}

	public void setLegalDistrict(Integer legalDistrict) {
		this.legalDistrict = legalDistrict;
	}

	public Integer getLegalProvince() {
		return legalProvince;
	}

	public void setLegalProvince(Integer legalProvince) {
		this.legalProvince = legalProvince;
	}

	public Integer getLegalResidenceCountry() {
		return legalResidenceCountry;
	}

	public void setLegalResidenceCountry(Integer legalResidenceCountry) {
		this.legalResidenceCountry = legalResidenceCountry;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNationality() {
		return nationality;
	}

	public void setNationality(Integer nationality) {
		this.nationality = nationality;
	}

	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	public String getOfficePhoneNumber() {
		return officePhoneNumber;
	}

	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public Integer getPostalDepartment() {
		return postalDepartment;
	}

	public void setPostalDepartment(Integer postalDepartment) {
		this.postalDepartment = postalDepartment;
	}

	public Integer getPostalDistrict() {
		return postalDistrict;
	}

	public void setPostalDistrict(Integer postalDistrict) {
		this.postalDistrict = postalDistrict;
	}

	public Integer getPostalProvince() {
		return postalProvince;
	}

	public void setPostalProvince(Integer postalProvince) {
		this.postalProvince = postalProvince;
	}

	public Integer getPostalResidenceCountry() {
		return postalResidenceCountry;
	}

	public void setPostalResidenceCountry(Integer postalResidenceCountry) {
		this.postalResidenceCountry = postalResidenceCountry;
	}

	public Date getRegistryDate() {
		return registryDate;
	}

	public void setRegistryDate(Date registryDate) {
		this.registryDate = registryDate;
	}

	public String getRegistryUser() {
		return registryUser;
	}

	public void setRegistryUser(String registryUser) {
		this.registryUser = registryUser;
	}

	public String getSecondDocumentNumber() {
		return secondDocumentNumber;
	}

	public void setSecondDocumentNumber(String secondDocumentNumber) {
		this.secondDocumentNumber = secondDocumentNumber;
	}

	public Integer getSecondDocumentType() {
		return secondDocumentType;
	}

	public void setSecondDocumentType(Integer secondDocumentType) {
		this.secondDocumentType = secondDocumentType;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public Integer getSecondNationality() {
		return secondNationality;
	}

	public void setSecondNationality(Integer secondNationality) {
		this.secondNationality = secondNationality;
	}

	public Integer getStateHolder() {
		return stateHolder;
	}

	public void setStateHolder(Integer stateHolder) {
		this.stateHolder = stateHolder;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Integer getDocumentSource() {
		return documentSource;
	}

	public void setDocumentSource(Integer documentSource) {
		this.documentSource = documentSource;
	}

	public Integer getDocumentIssuanceDate() {
		return documentIssuanceDate;
	}

	public void setDocumentIssuanceDate(Integer documentIssuanceDate) {
		this.documentIssuanceDate = documentIssuanceDate;
	}

	public Long getRelatedCui() {
		return relatedCui;
	}

	public void setRelatedCui(Long relatedCui) {
		this.relatedCui = relatedCui;
	}

	public String getFundAdministrator() {
		return fundAdministrator;
	}

	public void setFundAdministrator(String fundAdministrator) {
		this.fundAdministrator = fundAdministrator;
	}

	public String getFundType() {
		return fundType;
	}

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getTransferNumber() {
		return transferNumber;
	}

	public void setTransferNumber(String transferNumber) {
		this.transferNumber = transferNumber;
	}

	public String getMnemonic() {
		return mnemonic;
	}

	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
	}

	public String getMarriedLastName() {
		return marriedLastName;
	}

	public void setMarriedLastName(String marriedLastName) {
		this.marriedLastName = marriedLastName;
	}

	public Integer getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(Integer civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getMainActivity() {
		return mainActivity;
	}

	public void setMainActivity(String mainActivity) {
		this.mainActivity = mainActivity;
	}

	public String getJobSourceBusinessName() {
		return jobSourceBusinessName;
	}

	public void setJobSourceBusinessName(String jobSourceBusinessName) {
		this.jobSourceBusinessName = jobSourceBusinessName;
	}

	public Date getJobDateAdmission() {
		return jobDateAdmission;
	}

	public void setJobDateAdmission(Date jobDateAdmission) {
		this.jobDateAdmission = jobDateAdmission;
	}

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}

	public String getJobAddress() {
		return jobAddress;
	}

	public void setJobAddress(String jobAddress) {
		this.jobAddress = jobAddress;
	}

	public Integer getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(Integer totalIncome) {
		this.totalIncome = totalIncome;
	}

	public String getPerRefFullName() {
		return perRefFullName;
	}

	public void setPerRefFullName(String perRefFullName) {
		this.perRefFullName = perRefFullName;
	}

	public String getPerRefLandLine() {
		return perRefLandLine;
	}

	public void setPerRefLandLine(String perRefLandLine) {
		this.perRefLandLine = perRefLandLine;
	}

	public String getPerRefCellPhone() {
		return perRefCellPhone;
	}

	public void setPerRefCellPhone(String perRefCellPhone) {
		this.perRefCellPhone = perRefCellPhone;
	}

	public String getComerRefBusinessName() {
		return comerRefBusinessName;
	}

	public void setComerRefBusinessName(String comerRefBusinessName) {
		this.comerRefBusinessName = comerRefBusinessName;
	}

	public String getComerRefLandLine() {
		return comerRefLandLine;
	}

	public void setComerRefLandLine(String comerRefLandLine) {
		this.comerRefLandLine = comerRefLandLine;
	}

	public String getEntityPublicAppointment() {
		return entityPublicAppointment;
	}

	public void setEntityPublicAppointment(String entityPublicAppointment) {
		this.entityPublicAppointment = entityPublicAppointment;
	}

	public Integer getNitNaturalPerson() {
		return nitNaturalPerson;
	}

	public void setNitNaturalPerson(Integer nitNaturalPerson) {
		this.nitNaturalPerson = nitNaturalPerson;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFundCompanyEnrollment() {
		return fundCompanyEnrollment;
	}

	public void setFundCompanyEnrollment(String fundCompanyEnrollment) {
		this.fundCompanyEnrollment = fundCompanyEnrollment;
	}

	public Date getConstitutionDate() {
		return constitutionDate;
	}

	public void setConstitutionDate(Date constitutionDate) {
		this.constitutionDate = constitutionDate;
	}

	public byte[] getFilePhoto() {
		return filePhoto;
	}

	public void setFilePhoto(byte[] filePhoto) {
		this.filePhoto = filePhoto;
	}

	public byte[] getFileSigning() {
		return fileSigning;
	}

	public void setFileSigning(byte[] fileSigning) {
		this.fileSigning = fileSigning;
	}

	public Integer getIndCanNegotiate() {
		return indCanNegotiate;
	}

	public void setIndCanNegotiate(Integer indCanNegotiate) {
		this.indCanNegotiate = indCanNegotiate;
	}
	
	
}
