package com.javaport.mapbroker.controller;

import org.springframework.http.HttpStatus;

@RestController
public class HashMapController {

	@RequestMapping(value="", method=RequestMethod.PUT)
	public ResponseEntity<String> putContent(@PathVariable("instanceId") String instanceId,@RequestBody String content){
		return new ResponseEntity<>("The content is updated", HttpStatus.CREATED);
		
		
	}
}
