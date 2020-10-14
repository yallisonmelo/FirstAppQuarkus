package br.com.yfsmsystem.controller;

import br.com.yfsmsystem.service.ProductService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/v1/product")
public class ProductController {

    @Inject
    ProductService productService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RequestScoped
    public Response getProduct() {
        return Response.ok(productService.getProduct(),MediaType.APPLICATION_JSON).build();
    }
}
