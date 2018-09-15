package com.reports.providerdata.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "PROVIDER_DATA_TEST")
public class ProviderData {
	
	/*@Id
    private long id;*/
	
	@Field("National Provider Identifier")
	private long nationalProviderIdentifier;
	@Field("Last Name/Organization Name of the Provider")
	private String lastName;
	@Field("First Name of the Provider")	
	private String firstName;
	@Field("Middle Initial of the Provider")
	private String middleInitial;
	@Field("Credentials of the Provider")
	private String credentials;
	@Field("Gender of the Provider")
	private String gender;
	@Field("Entity Type of the Provider")
	private String entityType;
	@Field("Street Address 1 of the Provider")
	private String streetAddress1;
	@Field("Street Address 2 of the Provider")
	private String streetAddress2;
	@Field("City of the Provider")
	private String city;
	@Field("Zip Code of the Provider")
	private String zipCode;
	@Field("State Code of the Provider")
	private String stateCode;
	@Field("Country Code of the Provider")
	private String countryCode;
	@Field("Provider Type")
	private String providerType;
	@Field("Medicare Participation Indicator")
	private String medicareParticipationIndicator;
	@Field("Place of Service")
	private String placeOfService;
	@Field("HCPCS Code")
	private String hCPCSCode;
	@Field("HCPCS Description")
	private String hCPCSDescription;
	@Field("HCPCS Drug Indicator")
	private String hCPCSDrugIndicator;
	@Field("Number of Services")
	private float numberOfServices;
	@Field("Number of Medicare Beneficiaries")
	private float numberOfMedicareBeneficiaries;
	@Field("Number of Distinct Medicare Beneficiary/Per Day Services")
	private float numberOfDistinctMedicareBeneficiariesPerDay;
	@Field("Average Medicare Allowed Amount")
	private double averageMedicareAllowedAmount;
	@Field("Average Submitted Charge Amount")
	private double averageSubmittedChargeAmount;
	@Field("Average Medicare Payment Amount")
	private double averageMedicarePaymentAmount;
	@Field("Average Medicare Standardized Amount")
	private double averageMedicareStandardizedAmount;

	public ProviderData() {
		super();
	}

	public long getNationalProviderIdentifier() {
		return nationalProviderIdentifier;
	}

	public void setNationalProviderIdentifier(long nationalProviderIdentifier) {
		this.nationalProviderIdentifier = nationalProviderIdentifier;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getStreetAddress1() {
		return streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getProviderType() {
		return providerType;
	}

	public void setProviderType(String providerType) {
		this.providerType = providerType;
	}

	public String getMedicareParticipationIndicator() {
		return medicareParticipationIndicator;
	}

	public void setMedicareParticipationIndicator(String medicareParticipationIndicator) {
		this.medicareParticipationIndicator = medicareParticipationIndicator;
	}

	public String getPlaceOfService() {
		return placeOfService;
	}

	public void setPlaceOfService(String placeOfService) {
		this.placeOfService = placeOfService;
	}

	public String gethCPCSCode() {
		return hCPCSCode;
	}

	public void sethCPCSCode(String hCPCSCode) {
		this.hCPCSCode = hCPCSCode;
	}

	public String gethCPCSDescription() {
		return hCPCSDescription;
	}

	public void sethCPCSDescription(String hCPCSDescription) {
		this.hCPCSDescription = hCPCSDescription;
	}

	public String gethCPCSDrugIndicator() {
		return hCPCSDrugIndicator;
	}

	public void sethCPCSDrugIndicator(String hCPCSDrugIndicator) {
		this.hCPCSDrugIndicator = hCPCSDrugIndicator;
	}

	public float getNumberOfServices() {
		return numberOfServices;
	}

	public void setNumberOfServices(float numberOfServices) {
		this.numberOfServices = numberOfServices;
	}

	public float getNumberOfMedicareBeneficiaries() {
		return numberOfMedicareBeneficiaries;
	}

	public void setNumberOfMedicareBeneficiaries(float numberOfMedicareBeneficiaries) {
		this.numberOfMedicareBeneficiaries = numberOfMedicareBeneficiaries;
	}

	public float getNumberOfDistinctMedicareBeneficiariesPerDay() {
		return numberOfDistinctMedicareBeneficiariesPerDay;
	}

	public void setNumberOfDistinctMedicareBeneficiariesPerDay(float numberOfDistinctMedicareBeneficiariesPerDay) {
		this.numberOfDistinctMedicareBeneficiariesPerDay = numberOfDistinctMedicareBeneficiariesPerDay;
	}

	public double getAverageMedicareAllowedAmount() {
		return averageMedicareAllowedAmount;
	}

	public void setAverageMedicareAllowedAmount(double averageMedicareAllowedAmount) {
		this.averageMedicareAllowedAmount = averageMedicareAllowedAmount;
	}

	public double getAverageSubmittedChargeAmount() {
		return averageSubmittedChargeAmount;
	}

	public void setAverageSubmittedChargeAmount(double averageSubmittedChargeAmount) {
		this.averageSubmittedChargeAmount = averageSubmittedChargeAmount;
	}

	public double getAverageMedicarePaymentAmount() {
		return averageMedicarePaymentAmount;
	}

	public void setAverageMedicarePaymentAmount(double averageMedicarePaymentAmount) {
		this.averageMedicarePaymentAmount = averageMedicarePaymentAmount;
	}

	public double getAverageMedicareStandardizedAmount() {
		return averageMedicareStandardizedAmount;
	}

	public void setAverageMedicareStandardizedAmount(double averageMedicareStandardizedAmount) {
		this.averageMedicareStandardizedAmount = averageMedicareStandardizedAmount;
	}

}
