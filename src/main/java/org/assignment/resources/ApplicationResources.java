package org.assignment.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/rest")
public class ApplicationResources {

	@GET
	@Path("/sayuru")
	public Response sayHello() {
		return Response.status(200).entity("Hello Sayuru Bada").build();

	}


}
