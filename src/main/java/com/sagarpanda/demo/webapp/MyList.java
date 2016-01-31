package com.sagarpanda.demo.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("mylist")
public class MyList {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getUserList(){
		return "{\"name\":\"Sagar\"}";
	}
	
}
