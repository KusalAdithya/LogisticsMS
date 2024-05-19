package com.waka.controllers;

import com.waka.dto.PackageDTO;
import com.waka.remote.AddPackage;
import com.waka.remote.City;
import jakarta.ejb.EJB;
import jakarta.ejb.EJBAccessException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/addPackage")
public class AddPackageController {

    @EJB(lookup = "java:global/ear-1.0/com.waka-ejb-1.0/CityImpl")
    private City city;

    @EJB(lookup = "java:global/ear-1.0/com.waka-ejb-1.0/AddPackageImpl")
    private AddPackage addPackage;

    @Context
    private HttpServletRequest request;

    @GET
    public Viewable index(){
        request.setAttribute("allCities", city.getAllCities());
        return new Viewable("/addPackage");
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCargo(PackageDTO packageDTO) {

        String packageId = packageDTO.getPackageId();
        String customerName = packageDTO.getCustomerName();
        String mobile = packageDTO.getCustomerMobile();
        String address = packageDTO.getAddress();
        Double weight = packageDTO.getPackageWeight();

        System.out.println("Controller ----------------------- Package Id: " + packageId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Mobile: " + mobile);
        System.out.println("Address: " + address);
        System.out.println("Weight: " + weight);

        if (packageId.isEmpty() || customerName.isEmpty() || mobile.isEmpty() || address.isEmpty() || weight == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        } else {
            try {
                if (addPackage.addPackageData(packageDTO)) {
                    return Response.ok().entity("Package added successfully!").build();
                } else {
                    return Response.status(Response.Status.BAD_REQUEST).build();
                }
            } catch (EJBAccessException e) {
                return Response.status(Response.Status.UNAUTHORIZED).build();
            }
        }

    }

}
