package com.schnaub.resource;

import com.codahale.metrics.annotation.Timed;

import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/log")
@Produces(MediaType.APPLICATION_JSON)
public class ErrorResource {

    @POST
    @Timed
    public Response logError(@Valid Error error) {
        return Response.status(Response.Status.NO_CONTENT).build();
    }

}
