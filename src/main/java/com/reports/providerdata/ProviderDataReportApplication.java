package com.reports.providerdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ProviderDataReportApplication {

	public static void main(String[] args1) {
		SpringApplication.run(ProviderDataReportApplication.class, args1);
	}
}


