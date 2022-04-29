package com.example.pracevhodine.resources;

import com.example.pracevhodine.services.FootballService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("footbal")
@Produces(MediaType.APPLICATION_JSON)
public class FootballResource {

    @Inject
    private FootballService footballService;

    @GET
    public Response getTeams() {
        return Response.ok(footballService.getTeams()).build();
    }
}
