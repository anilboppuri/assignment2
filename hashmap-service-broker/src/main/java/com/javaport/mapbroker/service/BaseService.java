package com.javaport.mapbroker.service;

import org.springframework.stereotype.Service;

@Service
public class BaseService {

	private static final HashMap<String, String> hashMap = new HashMap<>();

	public void putItem(String key, String value) {

		hashMap.put(key, value);

	}

	public String getItem(String key) {

		return "";//hashMap.get(key);
	}
	
	public void remove(String key){
		
		
	}

}
