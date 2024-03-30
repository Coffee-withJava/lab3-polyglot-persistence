package br.workshop.lab3.sql.customer;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
@Path("/customer")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public interface Customers {

    @POST
    CustomerRequest create(CustomerRequest customer);

    @GET
    @Path("/{id}")
    CustomerRequest get(@PathParam("id") Long id);


}
