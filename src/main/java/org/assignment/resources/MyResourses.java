package org.assignment.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/best")
public class MyResourses {

	@GET
	@Path("/sayu")
	public Response sayHello() {
		return Response.status(200).entity("Hello Sayu").build();
	}
}
