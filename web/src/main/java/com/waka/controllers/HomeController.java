package com.waka.controllers;

import com.waka.dto.UserDTO;
import com.waka.entity.User;
import com.waka.remote.Login;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/login")
public class HomeController {

    @GET
    public Viewable index(){
        return new Viewable("/index");
    }

    @EJB(lookup = "java:global/ear-1.0/com.waka-ejb-1.0/LoginImpl")
    private Login login;

    @Context
    private HttpServletRequest request;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(UserDTO userDTO) {

        String username = userDTO.getUsername();
        String password = userDTO.getPassword();

        if (username.isEmpty() || password.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        } else {

            User user = login.login(username, password);

            if (user == null) {
                return Response.status(Response.Status.BAD_REQUEST).entity("Log In Failed.").build();
            } else {

                try {

                    if (user.getUserType().getName().equals("Admin")) {
                        request.login("admin", "admin123");
                    } else if (user.getUserType().getName().equals("Officer")) {
                        request.login("officer", "officer123");
                    }

                } catch (ServletException e) {
                    throw new RuntimeException(e);
                }

                HttpSession session = request.getSession();
                session.setAttribute("login", true);
                session.setAttribute("userType", user.getUserType().getName());

                return Response.status(Response.Status.OK).entity("Log In Success.").build();
            }
        }

    }

}
