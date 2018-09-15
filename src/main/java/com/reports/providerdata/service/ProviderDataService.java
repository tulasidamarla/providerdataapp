package com.reports.providerdata.service;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reports.providerdata.model.ProviderData;
import com.reports.providerdata.repository.ProviderDataRepository;

@Service
public class ProviderDataService {

	@Autowired
	private ProviderDataRepository providerDataRepository;

	public Iterable<ProviderData> getAllProvidersDataByLastName(String lastName) {
		
		return providerDataRepository.searchByLastName(lastName);
		//return getAllProvidersDataListFromExcel();
	}

	private List<ProviderData> getAllProvidersDataListFromExcel() {

		// Create the CSVFormat object
		CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
		Path path = Paths.get("C:", "Users", "SESA515341", "Desktop", "personal", "kris", "test_1000.csv");
		List<ProviderData> providersDataList = new ArrayList<>();

		// initialize the CSVParser object
		CSVParser parser = null;
		try {
			try {
				parser = new CSVParser(new FileReader(path.toFile()), format);

				for (CSVRecord record : parser) {
					ProviderData provider = new ProviderData();
					provider.setNationalProviderIdentifier(
							Integer.parseInt(record.get("National Provider Identifier")));
					provider.setLastName(record.get("Last Name/Organization Name of the Provider"));
					provider.setFirstName(record.get("First Name of the Provider"));
					provider.setMiddleInitial(record.get("Middle Initial of the Provider"));
					provider.setCredentials(record.get("Credentials of the Provider"));
					provider.setGender(record.get("Gender of the Provider"));
					provider.setEntityType(record.get("Entity Type of the Provider"));
					provider.setStreetAddress1(record.get("Street Address 1 of the Provider"));
					provider.setStreetAddress2(record.get("Street Address 2 of the Provider"));
					provider.setCity(record.get("City of the Provider"));
					provider.setZipCode(record.get("Zip Code of the Provider"));
					provider.setStateCode(record.get("State Code of the Provider"));
					provider.setCountryCode(record.get("Country Code of the Provider"));
					provider.setProviderType(record.get("Provider Type"));
					provider.setMedicareParticipationIndicator(
							record.get("Medicare Participation Indicator"));
					provider.setPlaceOfService(record.get("Place of Service"));
					provider.sethCPCSCode(record.get("HCPCS Code"));
					provider.sethCPCSDescription(record.get("HCPCS Description"));
					provider.sethCPCSDrugIndicator(record.get("HCPCS Drug Indicator"));
					provider.setNumberOfServices(Float.parseFloat(record.get("Number of Services")));
					provider.setNumberOfMedicareBeneficiaries(
							Float.parseFloat(record.get("Number of Medicare Beneficiaries")));
					provider.setNumberOfDistinctMedicareBeneficiariesPerDay(
							Float.parseFloat(record.get("Number of Distinct Medicare Beneficiary/Per Day Services")));
					provider.setAverageMedicareAllowedAmount(
							Double.parseDouble(record.get("Average Medicare Allowed Amount")));
					provider.setAverageSubmittedChargeAmount(
							Double.parseDouble(record.get("Average Submitted Charge Amount")));
					provider.setAverageMedicarePaymentAmount(
							Double.parseDouble(record.get("Average Medicare Payment Amount")));
					provider.setAverageMedicareStandardizedAmount(
							Double.parseDouble(record.get("Average Medicare Standardized Amount")));
					providersDataList.add(provider);
					if (providersDataList.size() == 1000) {
						return providersDataList;
					}
				}
				// close the parser
				parser.close();
			} finally {
				parser.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return providersDataList;
	}

	public boolean indexData() {
		providerDataRepository.save(getAllProvidersDataListFromExcel());
		return true;
	}
	
	public boolean mergeProviderData() {
		return providerDataRepository.merge();
	}

}
