package com.waka.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/signup")
public class SignupController {

    @GET
    public Viewable index() {
        return new Viewable("/signup");
    }
}
