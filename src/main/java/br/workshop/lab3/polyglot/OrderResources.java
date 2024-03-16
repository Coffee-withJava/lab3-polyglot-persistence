package br.workshop.lab3.polyglot;

import br.workshop.lab3.nosql.product.ProductResourcesClient;
import br.workshop.lab3.nosql.shoppingcart.ShoppingCartsResourcesClient;
import br.workshop.lab3.sql.customer.CustomerResourceClient;
import br.workshop.lab3.sql.order.OrderControllerClient;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/orders")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class OrderResources {

    @Inject
    @RestClient
    ProductResourcesClient products;

    @Inject
    @RestClient
    ShoppingCartsResourcesClient shoppingCarts;

    @Inject
    @RestClient
    CustomerResourceClient customers;

    @Inject
    @RestClient
    OrderControllerClient orders;

    @POST
    public OrderResponse generateOrder(OrderRequest request) {
        // TODO: implement me
        throw new UnsupportedOperationException("implement me!");
    }

}
