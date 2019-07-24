package com.authentication.authenticationREST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("random")
public class CustomResource {
	
	@GET
	public String testMethod() {
		return "Has connection!";
	}

}
