package com.shekhar.constants;

import lombok.Getter;

public class FrameworkConstants {

	private static @Getter final String requestJsonFolderpath = System.getProperty("user.dir")
			+ "/src/test/resources/jsons/test.json";
	private static @Getter final String responseJsonFolderpath = System.getProperty("user.dir")
			+ "/test-output/responseOutput/createdresponse.json";
	
	private static @Getter final String configFilepath = System.getProperty("user.dir")
			+ "/src/test/resources/config.properties";
	
	private static @Getter final String schemaFilepath = System.getProperty("user.dir")
			+ "/src/test/resources/schema/schema.json";

}
