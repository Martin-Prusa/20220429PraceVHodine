package com.example.pracevhodine.resources;

import com.example.pracevhodine.models.PlayersGroup;
import com.example.pracevhodine.services.ChessService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/chess")
@Produces(MediaType.APPLICATION_JSON)
public class ChessResource {

    @Inject
    private ChessService chessService;

    @GET
    public Response getPlayers() {
        return Response.ok(chessService.getPlayersByGender()).build();
    }

    @GET
    @Path("/countries")
    public Response getPlayersByCountry() {
        return Response.ok(chessService.getPlayersByCountry()).build();
    }
}