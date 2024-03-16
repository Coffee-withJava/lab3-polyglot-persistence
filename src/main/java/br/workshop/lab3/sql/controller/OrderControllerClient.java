package br.workshop.lab3.sql.controller;

import br.workshop.lab3.sql.dto.ItemDTO;
import br.workshop.lab3.sql.dto.OrderDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient
@Path("/order")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public interface OrderControllerClient {

    @GET
    @Path("/{id}")
    Object getOrderService(@PathParam("id") Long id);

    @POST
    @Path("/saveorder")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    List<Object> saveOrder(OrderDTO order);

    @GET
    @Path("/{orderId}/items")
    List<ItemDTO> getOrderItemsByOrderId(@PathParam("orderId") Long orderId);

}
