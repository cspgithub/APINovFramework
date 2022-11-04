package com.shekhar.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.response.Response;

public final class APIUtil {

	private APIUtil() {
		// TODO Auto-generated constructor stub
	}

	public static String readJsonAndreturnAsString(String filepath) throws IOException {
		return new String(Files.readAllBytes(Paths.get(filepath)));
	}
	
	public static String readSchemaAndreturnAsString(String filepath) throws IOException {
		return new String(Files.readAllBytes(Paths.get(filepath)));
	}

	public static void storeStringAsJsonFile(String filepath, Response response) throws IOException {
		Files.write(Paths.get(filepath), response.asByteArray());

	}
}
