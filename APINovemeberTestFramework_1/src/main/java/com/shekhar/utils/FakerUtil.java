package com.shekhar.utils;

import com.github.javafaker.Faker;

public final class FakerUtil {

	private FakerUtil() {
		// TODO Auto-generated constructor stub
	}

	private static final Faker faker = new Faker();

	public static String createFirstName() {

		return faker.name().firstName();
	}

}
