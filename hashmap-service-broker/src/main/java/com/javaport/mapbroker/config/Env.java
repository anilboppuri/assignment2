package com.javaport.mapbroker.config;

public class Env {

	 public static String serviceHost;
	 public static String servicePort;
	 public static String serviceAdminUserName;
	 public static String serviceAdminPassword;
	 
	 
	 static{
		 
		  serviceHost= System.getenv("HASHMAP_SERVICE_HOST");
		  servicePort=System.getenv("HASHMAP_SERVICE_PORT");
		  serviceAdminUserName=System.getenv("HASHMAP_SERVICE_ADMIN_USERNAME");
		  serviceAdminPassword=System.getenv("HASHMAP_SERVICE_ADMIN_PASSWORD");
		 
	 }
}
