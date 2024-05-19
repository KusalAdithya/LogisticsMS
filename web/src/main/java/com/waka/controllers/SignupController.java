package com.waka.controllers;

import com.waka.dto.UserDTO;
import com.waka.remote.Signup;
import jakarta.ejb.EJB;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/signup")
public class SignupController {

    @GET
    public Viewable index() {
        return new Viewable("/signup");
    }

    @EJB(lookup = "java:global/ear-1.0/com.waka-ejb-1.0/SignupImpl")
    private Signup signUp;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response signUp(UserDTO userDTO) {

        String name = userDTO.getName();
        String mobileNumber = userDTO.getMobileNumber();
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();

        if (name.isEmpty() || mobileNumber.isEmpty() || username.isEmpty() || password.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        } else {

            if (!signUp.signup(name, mobileNumber, username, password)) {
                return Response.status(Response.Status.BAD_REQUEST).entity("Registration Failed.").build();
            } else {
                return Response.status(Response.Status.OK).entity("Registration Success.").build();
            }

        }

    }

}
