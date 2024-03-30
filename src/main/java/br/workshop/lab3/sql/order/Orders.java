package br.workshop.lab3.sql.order;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient
@Path("/order")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public interface Orders {
    @GET
    @Path("/{id}")
    OrderResponse getOrder(@PathParam("id") Long id);

    @POST
    @Path("/saveOrder")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    OrderResponse saveOrder(OrderRequest order);

    @GET
    @Path("/{orderId}/items")
    List<ItemResponse> getOrderItemsByOrderId(@PathParam("orderId") Long orderId);

}
