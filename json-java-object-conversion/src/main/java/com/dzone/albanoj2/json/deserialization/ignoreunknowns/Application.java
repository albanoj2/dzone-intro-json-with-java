package com.dzone.albanoj2.json.deserialization.ignoreunknowns;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public static void main(String[] args) throws IOException {

		String json = "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"alias\":\"Jay\","
				+ "\"age\":29,\"address\":{\"street\":\"100 Elm Way\",\"city\":\"Foo City\","
				+ "\"state\":\"NJ\",\"zipCode\":\"01234\"},\"isMale\":true, \"favoriteColor\":\"blue\"}";

		ObjectMapper mapper = new ObjectMapper();
		Person johnDoe = mapper.readValue(json, Person.class);

		System.out.println(johnDoe);
	}
}
