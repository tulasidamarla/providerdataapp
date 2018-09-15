package com.reports.providerdata.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Projections;
import com.reports.providerdata.model.ProviderData;

@Repository
public class ProviderDataRepositoryImpl implements ProviderDataRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	Map<Integer, String> providerIdentifierMap = new HashMap<>();
	
	@Override
	public List<ProviderData> searchByLastName(String lastName) {
		Query getQuery = new Query();
		getQuery.addCriteria(Criteria.where("Last Name/Organization Name of the Provider").is(lastName));
		return mongoTemplate.find(getQuery, ProviderData.class);
	}

	@Override
	public void save(List<ProviderData> providerDataList) {
		mongoTemplate.insertAll(providerDataList);
	}

	@Override
	public boolean merge() {

		Query getQuery = new Query();
		getQuery.addCriteria(Criteria.where("Last Name/Organization Name of the Provider"));
		
		MongoClient client = new MongoClient("localhost");
		
		FindIterable<Document> projection = client.getDatabase("PROVIDER-DATA-DB").getCollection("EPROVIDER").find().projection(Projections.include("NPI","Group Practice"));
				//distinct("NPI", filter, resultClass)
		for(Document doc: projection) {
			providerIdentifierMap.putIfAbsent(doc.getInteger("NPI"), doc.getString("Group Practice"));
		}
		
		client.close();
		
		System.out.println(" ///////////////" + providerIdentifierMap.size());
		System.out.println(providerIdentifierMap.toString());
		System.out.println("////////////////////");
		
		for(int npi: providerIdentifierMap.keySet()) {
			/*DBObject query = new BasicDBObject("National Provider Identifier",
					new BasicDBObject("$eq", npi));*/
			Query query = new Query();
			query.addCriteria(Criteria.where("National Provider Identifier").is(npi));
			
			/*DBObject update = new BasicDBObject();
			update.put("$set", new BasicDBObject("color", "Blue"));*/
			Update update = new Update();
			update.set("Group Practice", providerIdentifierMap.get(npi));
			mongoTemplate.updateMulti(query, update, ProviderData.class);
			//mongoTemplate.upsert(query, update, ProviderData.class);
			//mongoTemplate.findAndModify(query, update, ProviderData.class);
		}
		return true;
	}
	
	

}
