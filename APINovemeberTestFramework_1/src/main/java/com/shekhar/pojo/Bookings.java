package com.shekhar.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder(setterPrefix = "set")
@Getter
public class Bookings {

	private String firstname;
	@Setter
	private String lastname;
	private int totalprice;
	private boolean depositpaid;

	private Bookingdates bookingdates;
	private String additionalneeds;
	
	

}
