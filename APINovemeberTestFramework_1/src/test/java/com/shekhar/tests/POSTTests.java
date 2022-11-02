package com.shekhar.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.shekhar.constants.FrameworkConstants;
import com.shekhar.pojo.Bookingdates;
import com.shekhar.pojo.Bookings;
import com.shekhar.requestbuilder.RequestBuilder;
import com.shekhar.utils.APIUtil;
import com.shekhar.utils.FrameworkTestData;

import io.restassured.response.Response;

public class POSTTests {

	@Test

	public void postCallTest() throws IOException {

		Bookingdates bkdate = Bookingdates.builder().setCheckin("2013-02-23").setCheckout("2013-02-23").build();

		Bookings bk = Bookings.builder().setFirstname(FrameworkTestData.getFirstname()).setLastname("pandey")
				.setTotalprice(456).setDepositpaid(true).setBookingdates(bkdate).setAdditionalneeds("breakfast")
				.build();

		Response response = RequestBuilder.buildRequestForPOSTRequest().body(bk).post("/booking");

		response.prettyPrint();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		//store recvd response @location
		APIUtil.storeStringAsJsonFile(FrameworkConstants.getResponseJsonFolderpath(), response);
		
		//to do
		//dataprovider-https://github.com/mfaisalkhatri/rest-assured-examples/blob/master/src/test/java/io/github/mfaisalkhatri/TestPostRequests.java
		//schema validation
	}
	
	@Test

	public void postCallUsingExternalFileTest() throws IOException {
		
		Response response = RequestBuilder
				.buildRequestForPOSTRequest()
				.body(APIUtil.readJsonAndreturnAsString(FrameworkConstants.getRequestJsonFolderpath()))
				.post("/booking");
		response.prettyPrint();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
