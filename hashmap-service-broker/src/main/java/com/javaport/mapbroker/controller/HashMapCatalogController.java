package com.javaport.mapbroker.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Configuration;

@Configuration
public class HashMapCatalogController {

	@Bean
	public Catalog catalog(){
		
		return new Catalog(
				Collections.singletonList(new ServiceDefinition("HashMap-service-broker","hashmap-service", "A hashmap broker implementation",true,false,
						Collections.singletonList(new Plan("hashmap-plan","basic","This is a free basic plan.",getPlanMeadata()),Arrays.asList("search","document"),getMetadata(),null,null)))
				);
	}
	private Map<String,Object> getMetadata(){
		Map<String, Object> metadata = new HashMap<>();
		metadata.put("displayName", "HashMap Service");
		metadata.put("longDescription", "A search service based on ....");
		return metadata;
		
	}
	private Map<String,Object> getPlanMetaData(){
		Map<String,Object> metadata = new HashMap<>();
		metadata.put("costs", getCosts);
		return metadata;
		
	}
	
	private List<Map<String,Object>> getCosts(){
		
		Map<String,Object> costsMap = new HashMap<>();
		Map<String,Object> amount = new HashMap<>();
		
		amount.put("INR", 0.0);
		costsMap.put("amount",amount);
		return Collections.singletonList(costsMap);
	}
}
