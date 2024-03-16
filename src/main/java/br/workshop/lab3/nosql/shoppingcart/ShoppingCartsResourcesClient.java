package br.workshop.lab3.nosql.shoppingcart;

import jakarta.validation.constraints.Positive;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
@Path("/shopping-carts")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public interface ShoppingCartsResourcesClient {

    @GET
    @Path("{customerId}")
    ShoppingCartResponse shoppingCart(@PathParam("customerId") @Positive Long customerId);

    @DELETE
    @Path("{customerId}")
    void deleteShoppingCart(@PathParam("customerId") Long customerId) ;

    @POST
    @Path("{customerId}/items/")
    ShoppingCartResponse setItem(@PathParam("customerId") @Positive Long customerId,
                                        ItemShoppingCartRequest request);

    @DELETE
    @Path("{customerId}/items/{productId}")
    ShoppingCartResponse removeItem(@PathParam("customerId") @Positive Long customerId,
                                           @PathParam("productId") String productId);

}
