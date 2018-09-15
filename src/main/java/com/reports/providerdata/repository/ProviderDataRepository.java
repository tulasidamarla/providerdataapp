package com.reports.providerdata.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.reports.providerdata.model.ProviderData;

@Repository
public interface ProviderDataRepository /*extends MongoRepository<ProviderData, Long>*/{
	
	/*@Query("{'Last Name/Organization Name of the Provider' : ?0}")
	public Iterable<ProviderData> searchByLastName(String lastName);*/
	
	public List<ProviderData> searchByLastName(String lastName);
	
	public void save(List<ProviderData> providerDataList);

	public boolean merge();
	
	
	
}
