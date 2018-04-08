package com.sample;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SimpleSoapService {

	public void constructor() {
		
	}
	
	@WebMethod
	public String helloWorld(String name) {
		return "Hello " + name;
	}
}
