package br.workshop.lab3.sql.controller;

import br.workshop.lab3.sql.dto.ItemDTO;
import br.workshop.lab3.sql.dto.OrderDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@ApplicationScoped
@Path("/order")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class OrderController {

    @Inject
    @RestClient
    OrderControllerClient client;

    @GET
    @Path("/{id}")
    public Object getOrderService(@PathParam("id") Long id) {
        return client.getOrderService(id);
    }

    @POST
    @Path("/saveorder")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> saveOrder(OrderDTO order) {
        return client.saveOrder(order);
    }


    @GET
    @Path("/{orderId}/items")
    public List<ItemDTO> getOrderItemsByOrderId(@PathParam("orderId") Long orderId) {
        return client.getOrderItemsByOrderId(orderId);
    }

}
