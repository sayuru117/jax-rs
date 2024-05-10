package org.assignment.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/best")
public class BillingResourses {

	@GET
	@Path("/hello")
	public Response sayHello() {
		return Response.status(200).entity("Hello").build();
	}
}
