package com.edv.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PARTICIPANT")
public class Participant implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_PARTICIPANT_PK")
	private Long idParticipantPk;
	
	@Column(name="ACCOUNT_CLASS")
	private Integer accountClass;

	@Column(name="ACCOUNT_TYPE")
	private Integer accountType;

	@Column(name="ADDRESS")
	private String address;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="COMMERCIAL_REGISTER")
	private String commercialRegister;

	@Column(name="CONTACT_NAME")
	private String contactName;

	@Column(name="CONTACT_PHONE")
	private String contactPhone;

    @Temporal( TemporalType.DATE)
	@Column(name="CONTRACT_DATE")    
	private Date contractDate;

	@Column(name="CONTRACT_NUMBER")
	private String contractNumber;

    @Temporal( TemporalType.DATE)
	@Column(name="CREATION_DATE")  
	private Date creationDate;

    @Column(name="CURRENCY")
	private Integer currency;

    @Column(name="DESCRIPTION")
	private String description;

	@Column(name="DOCUMENT_NUMBER")
	private String documentNumber;

	@Column(name="DOCUMENT_TYPE")
	private Integer documentType;

	@Column(name="ECONOMIC_ACTIVITY")
	private Integer economicActivity;

	@Column(name="ECONOMIC_SECTOR")
	private Integer economicSector;

	@Column(name="EMAIL")
	private String email;

	@Column(name="FAX_NUMBER")
	private String faxNumber;

	@Column(name="LAST_MODIFY_APP")
	private Integer lastModifyApp;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="LAST_MODIFY_DATE")
	private Date lastModifyDate;

	@Column(name="LAST_MODIFY_IP")
	private String lastModifyIp;

	@Column(name="LAST_MODIFY_USER")
	private String lastModifyUser;

	@Column(name="MNEMONIC")
	private String mnemonic;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="REGISTRY_DATE")
	private Date registryDate;

	@Column(name="REGISTRY_USER")
	private String registryUser;

	@Column(name="RESIDENCE_COUNTRY")
	private Integer residenceCountry;

	@Column(name="SOCIAL_CAPITAL")
	private Double socialCapital;

	@Column(name="STATE")
	private Integer state;

	@Column(name="SUPERINTENDENT_RESOLUTION")
	private String superintendentResolution;

    @Temporal( TemporalType.DATE)
	@Column(name="SUPERINTENDENT_RESOLUTION_DATE")
	private Date superintendentResolutionDate;

    @Column(name="WEBSITE")
	private String website;
    
    @Column(name="BIC_CODE")
	private String bicCode;

    @Column(name="ID_USE_TYPE")
    private Integer idUseType;

    @Column(name="IND_PARTICIPANT_DEPOSITORY")
    private Integer indParticipantDepository;

    @Column(name="ACCOUNTS_STATE")
    private Integer accountsState;
    
    @Column(name="PAYMENT_STATE")
    private Integer paymentState;

	public Long getIdParticipantPk() {
		return idParticipantPk;
	}

	public void setIdParticipantPk(Long idParticipantPk) {
		this.idParticipantPk = idParticipantPk;
	}

	public Integer getAccountClass() {
		return accountClass;
	}

	public void setAccountClass(Integer accountClass) {
		this.accountClass = accountClass;
	}

	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCommercialRegister() {
		return commercialRegister;
	}

	public void setCommercialRegister(String commercialRegister) {
		this.commercialRegister = commercialRegister;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getCurrency() {
		return currency;
	}

	public void setCurrency(Integer currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
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

	public String getMnemonic() {
		return mnemonic;
	}

	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public Integer getResidenceCountry() {
		return residenceCountry;
	}

	public void setResidenceCountry(Integer residenceCountry) {
		this.residenceCountry = residenceCountry;
	}

	public Double getSocialCapital() {
		return socialCapital;
	}

	public void setSocialCapital(Double socialCapital) {
		this.socialCapital = socialCapital;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getSuperintendentResolution() {
		return superintendentResolution;
	}

	public void setSuperintendentResolution(String superintendentResolution) {
		this.superintendentResolution = superintendentResolution;
	}

	public Date getSuperintendentResolutionDate() {
		return superintendentResolutionDate;
	}

	public void setSuperintendentResolutionDate(Date superintendentResolutionDate) {
		this.superintendentResolutionDate = superintendentResolutionDate;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getBicCode() {
		return bicCode;
	}

	public void setBicCode(String bicCode) {
		this.bicCode = bicCode;
	}

	public Integer getIdUseType() {
		return idUseType;
	}

	public void setIdUseType(Integer idUseType) {
		this.idUseType = idUseType;
	}

	public Integer getIndParticipantDepository() {
		return indParticipantDepository;
	}

	public void setIndParticipantDepository(Integer indParticipantDepository) {
		this.indParticipantDepository = indParticipantDepository;
	}

	public Integer getAccountsState() {
		return accountsState;
	}

	public void setAccountsState(Integer accountsState) {
		this.accountsState = accountsState;
	}

	public Integer getPaymentState() {
		return paymentState;
	}

	public void setPaymentState(Integer paymentState) {
		this.paymentState = paymentState;
	}
    
    
}
