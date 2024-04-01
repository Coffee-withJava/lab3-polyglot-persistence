package br.workshop.lab3.polyglot;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/orders")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class OrderResources {

    @GET
    @Path("/{id}")
    public Response get(@PathParam("id") Long orderId) {
        // TODO
        throw new UnsupportedOperationException("must be implement!");
    }

    @POST
    public Response generateOrder(PaymentRequest request) {
        // TODO
        throw new UnsupportedOperationException("must be implement!");
    }

}
