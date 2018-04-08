package com.sample;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value="world/greet")
public class SimpleRESTService {

	//Empty constructor
	public void SimpleRestService() {
		
	}
	
	@GET
	@Consumes("text/xml")
	@Produces("text/xml")
	public String getGreeting(String name) {
		return "Hello " + name;
	}
	
	@PUT
	@Consumes("text/xml")
	@Produces("text/xml")
	public String putName(String name) {
		String myname = name;
		return "SUCCESS";
	}
}
