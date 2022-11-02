package com.shekhar.pojo;

import lombok.Builder;
import lombok.Getter;


@Builder(setterPrefix = "set")
@Getter
public class Bookings {

	private String firstname;
	private String lastname;
	private int totalprice;
	private boolean depositpaid;

	private Bookingdates bookingdates;
	private String additionalneeds;
	
	

}
