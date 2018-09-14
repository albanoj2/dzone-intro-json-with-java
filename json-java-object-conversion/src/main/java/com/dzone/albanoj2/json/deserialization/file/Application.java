package com.dzone.albanoj2.json.deserialization.file;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public static void main(String[] args) throws IOException {

		ObjectMapper mapper = new ObjectMapper();
		
		Person johnDoe = mapper.readValue(Application.class.getResourceAsStream("/john.json"), Person.class);
		System.out.println(johnDoe);
	}
}
