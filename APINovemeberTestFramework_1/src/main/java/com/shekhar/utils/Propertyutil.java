package com.shekhar.utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.shekhar.constants.FrameworkConstants;
import com.shekhar.enums.PropertiesType;

public final class Propertyutil {

	private Propertyutil() {
		// TODO Auto-generated constructor stub
	}

	private static Properties prop = new Properties();
	private static Map<String, String> hm = new HashMap<String, String>();

	static  {

		try(FileInputStream fis = new FileInputStream(FrameworkConstants.getConfigFilepath())) {
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		prop.entrySet().forEach(e -> hm.put(String.valueOf(e.getKey()), String.valueOf(e.getValue())));

	}
	public static String getValueFromMap(PropertiesType key) {

		return hm.get(key.name().toLowerCase());
	}
	
	

}
