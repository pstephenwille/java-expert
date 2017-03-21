package com.swille.services;

import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RestController
public class Slack {

    @GET
    @Path("/{channel}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getChannelPosts(@PathParam("channel") String channel)
    {
        System.out.println("....channel "+ channel);
        return Response.ok().build();
    }
}
