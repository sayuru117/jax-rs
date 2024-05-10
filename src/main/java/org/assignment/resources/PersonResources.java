package org.assignment.resources;

import org.assignment.DAO.PersonDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/person")
public class PersonResources {

	private PersonDAO personDAO = new PersonDAO();

	@GET
	@Path(value = "/getPerson")
	public Response sayHello() {
		return Response.status(200).entity("").build();
	}
}
