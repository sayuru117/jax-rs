package org.assignment.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/appointment")
public class AppointmentResources {

	@GET
	@Path("/sayuru")
	public Response sayHello() {
		return Response.status(200).entity("Hello Sayuru Bada").build();

	}


}
