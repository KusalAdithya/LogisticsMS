package com.waka.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;

import java.io.IOException;

@Path("/signout")
public class SignoutController {
    @Context
    private HttpServletRequest request;

    @Context
    private HttpServletResponse response;

    @GET
    public void index() throws IOException {
        request.getSession().invalidate();
        response.sendRedirect("/web/");
    }
}
