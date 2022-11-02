package com.shekhar.pojo;

import lombok.Builder;
import lombok.Getter;

@Builder(setterPrefix = "set")
@Getter
public class Bookingdates {

	private String checkin;
	private String checkout;
	
	
	
}


