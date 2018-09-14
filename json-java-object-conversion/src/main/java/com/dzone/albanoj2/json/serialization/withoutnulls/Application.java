package com.dzone.albanoj2.json.serialization.withoutnulls;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public static void main(String[] args) throws JsonProcessingException {
		
		Address johnDoeAddress = new Address("100 Elm Way", "Foo City", "NJ", "01234");
		Person johnDoe = new Person("John", "Doe", null, 29, true, johnDoeAddress);
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper.writeValueAsString(johnDoe);
		System.out.println(json);
	}
}
