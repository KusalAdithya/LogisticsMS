package com.waka.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/")
public class OrderTrackingController {
    @GET
    public Viewable index(){
        return new Viewable("/orderTracking");
    }
}
