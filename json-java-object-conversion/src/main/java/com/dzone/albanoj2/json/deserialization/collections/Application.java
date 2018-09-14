package com.dzone.albanoj2.json.deserialization.collections;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public static void main(String[] args) throws IOException {

		String json = "[{\"firstName\":\"John\",\"lastName\":\"Doe\",\"age\":29,"
				+ "\"address\":{\"street\":\"100 Elm Way\",\"city\":\"Foo City\","
				+ "\"state\":\"NJ\",\"zipCode\":\"01234\"},\"isMale\":true},"
				+ "{\"firstName\":\"Jane\",\"lastName\":\"Doe\",\"age\":27,"
				+ "\"address\":{\"street\":\"200 Boxer Road\",\"city\":\"Bar City\","
				+ "\"state\":\"NJ\",\"zipCode\":\"09876\"},\"isMale\":false}]";

		ObjectMapper mapper = new ObjectMapper();

		@SuppressWarnings("unchecked")
		List<Person> people = (List<Person>) mapper.readValue(json, List.class);
		System.out.println(people);
	}
}
