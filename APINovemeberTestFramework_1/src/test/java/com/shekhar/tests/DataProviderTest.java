package com.shekhar.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "getData")

	public void dpTest(String username) {

		System.out.println(username);

	}

	@DataProvider

	// first[] -- how many time u wish to execute --rows
	// second [] -- how manay parameters like all columns
	//3*1
	//3 rows - time execute
	//1 column -- one parammerer

	public Object[][] getData() {
		return new Object[][] { { "sas" }, { "sassasas" }, { "sasaS" } };

	}

}
