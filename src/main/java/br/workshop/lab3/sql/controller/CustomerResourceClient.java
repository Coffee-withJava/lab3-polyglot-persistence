package br.workshop.lab3.sql.controller;

import br.workshop.lab3.sql.dto.CustomerDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
@Path("/customer")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public interface CustomerResourceClient {

    @POST
    CustomerDTO create(CustomerDTO customer);

    @GET
    @Path("/{id}")
    CustomerDTO get(@PathParam("id") String id);


}
