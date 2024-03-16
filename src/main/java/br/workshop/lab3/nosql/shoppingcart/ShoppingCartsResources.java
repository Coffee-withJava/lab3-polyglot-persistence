package br.workshop.lab3.nosql.shoppingcart;

import jakarta.inject.Inject;
import jakarta.validation.constraints.Positive;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/shopping-carts")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class ShoppingCartsResources {

    @Inject
    ShoppingCartsResourcesClient client;

    @GET
    @Path("{customerId}")
    public ShoppingCartResponse shoppingCart(@PathParam("customerId") @Positive Long customerId) {
        return client.shoppingCart(customerId);
    }

    @POST
    @Path("{customerId}/items/")
    public ShoppingCartResponse setItem(@PathParam("customerId") @Positive Long customerId,
                                        ItemShoppingCartRequest request) {

        return client.setItem(customerId, request);
    }

    @DELETE
    @Path("{customerId}/items/{productId}")
    public ShoppingCartResponse removeItem(@PathParam("customerId") @Positive Long customerId,
                                           @PathParam("productId") String productId) {
        return client.removeItem(customerId, productId);
    }

}
