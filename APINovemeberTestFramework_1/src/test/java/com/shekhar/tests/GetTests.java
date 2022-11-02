package com.shekhar.tests;

import org.testng.annotations.Test;

import com.shekhar.requestbuilder.RequestBuilder;

import io.restassured.response.Response;

public class GetTests {

	@Test

	public void getBooks() {

		Response response = RequestBuilder.buildRequestForGetRequest().get("/booking");

		response.prettyPrint();

	}

	@Test

	public void getBook() {

		Response response = RequestBuilder.buildRequestForGetRequest().pathParam("bookingid", 4522)
				.get("/booking/{bookingid}");

		response.prettyPrint();

	}

}
