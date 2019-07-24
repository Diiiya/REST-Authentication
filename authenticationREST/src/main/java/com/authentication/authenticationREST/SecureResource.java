package com.authentication.authenticationREST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("secure")
public class SecureResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String secureTestMethod() {
		return "Has completed from secure class";
	}

}
