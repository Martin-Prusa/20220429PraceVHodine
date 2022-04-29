package com.example.pracevhodine.resources;

import com.example.pracevhodine.services.GamesService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("games")
@Produces(MediaType.APPLICATION_JSON)
public class GamesResource {

    @Inject
    private GamesService gamesService;

    @GET
    public Response getGames() {
        return Response.ok(gamesService.getGames()).build();
    }

    @GET
    @Path("publishers")
    public Response getPublishers() {
        return Response.ok(gamesService.getPublishers()).build();
    }

    @GET
    @Path("developers")
    public Response getDevelopers() {
        return Response.ok(gamesService.getDevelopers()).build();
    }
}
