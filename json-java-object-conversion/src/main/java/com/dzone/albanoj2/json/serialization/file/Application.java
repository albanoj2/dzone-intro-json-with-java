package com.dzone.albanoj2.json.serialization.file;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public static void main(String[] args) throws IOException {
		
		Address johnDoeAddress = new Address("100 Elm Way", "Foo City", "NJ", "01234");
		Person johnDoe = new Person("John", "Doe", null, 29, true, johnDoeAddress);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("john.json"), johnDoe);
	}
}
