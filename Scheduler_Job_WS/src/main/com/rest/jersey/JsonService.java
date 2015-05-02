package com.rest.jersey;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import model.StagHealthPath;

@Path("/jsonServices")
@Provider
public class JsonService {
	@GET
	@Path("/print/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public StagHealthPath produceJSON( @PathParam("name") String name ) {
		StagHealthPath hp = new StagHealthPath(1,"1",name,"11","Mondor","27/04/2015","28/04/2015",new Date(System.currentTimeMillis()),"200000","json file");
		return hp;
	}

	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consumeJSON( StagHealthPath hp ) {
		String output = hp.toString();
		return Response.status(200).entity(output).build();
	}

}