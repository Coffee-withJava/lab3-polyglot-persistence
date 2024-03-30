package br.workshop.lab3.polyglot;

import br.workshop.lab3.nosql.product.Products;
import br.workshop.lab3.nosql.shoppingcart.ShoppingCarts;
import br.workshop.lab3.sql.customer.Customers;
import br.workshop.lab3.sql.order.ItemRequest;
import br.workshop.lab3.sql.order.Orders;
import br.workshop.lab3.sql.order.OrderRequest;
import br.workshop.lab3.sql.order.OrderResponse;
import jakarta.inject.Inject;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/orders")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class OrderResources {

    @Inject
    @RestClient
    Products products;

    @Inject
    @RestClient
    ShoppingCarts shoppingCarts;

    @Inject
    @RestClient
    Customers customers;

    @Inject
    @RestClient
    Orders orders;

    @GET
    @Path("/{id}")
    public OrderResponse get(@PathParam("id") Long orderId) {
        return orders.getOrder(orderId);
    }

    @POST
    public OrderResponse generateOrder(PaymentRequest request) {

        customers.get(request.customerId());

        var actualItems = shoppingCarts.getShoppingCart(request.customerId()).items();

        if(actualItems.isEmpty())
            throw new BadRequestException("shopping cart is empty");

        var savedOrder = orders.saveOrder(
                new OrderRequest(request.customerId(),
                        request.paymentTransaction(),
                        actualItems.stream()
                                .map(item -> new ItemRequest(
                                        item.productId(),
                                        item.quantity(),
                                        item.productPrice())).toList())
        );

        shoppingCarts.deleteShoppingCart(request.customerId());

        return savedOrder;
    }

}
