package com.shekhar.requestbuilder;

import static io.restassured.RestAssured.*;

import com.shekhar.enums.PropertiesType;
import com.shekhar.utils.Propertyutil;

import io.restassured.http.ContentType;

import io.restassured.specification.RequestSpecification;

public final class RequestBuilder {

	public RequestBuilder() {
		// TODO Auto-generated constructor stub
	}

	public static RequestSpecification buildRequestForGetRequest() {

		return given()
				.baseUri(Propertyutil.getValueFromMap(PropertiesType.BASEURI))
				.contentType(ContentType.JSON)
				.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.log()
				.all();
	}

	
	public static RequestSpecification buildRequestForPOSTRequest() {

		return buildRequestForGetRequest()
				.contentType(ContentType.JSON);
				
	}
}
