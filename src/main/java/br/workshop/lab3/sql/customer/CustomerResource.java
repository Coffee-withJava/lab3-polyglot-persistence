package br.workshop.lab3.sql.customer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
@Path("/customer")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class CustomerResource {
    @Inject
    @RestClient
    Customers client;

    @POST
    public CustomerRequest create(CustomerRequest customer){
        return client.create(customer);
    }

    @GET
    @Path("/{id}")
    public CustomerRequest get(@PathParam("id") Long id){
        return client.get(id);
    }
}
