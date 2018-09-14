package com.dzone.albanoj2.json.serialization.collections;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public static void main(String[] args) throws JsonProcessingException {
		
		Address johnDoeAddress = new Address("100 Elm Way", "Foo City", "NJ", "01234");
		Person johnDoe = new Person("John", "Doe", null, 29, true, johnDoeAddress);
		
		Address janeDoeAddress = new Address("200 Boxer Road", "Bar City", "NJ", "09876");
		Person janeDoe = new Person("Jane", "Doe", null, 27, false, janeDoeAddress);
		
		List<Person> people = List.of(johnDoe, janeDoe);
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper.writeValueAsString(people);
		System.out.println(json);
	}
}
