package br.workshop.lab3.polyglot;

import br.workshop.lab3.nosql.shoppingcart.ItemShoppingCartRequest;
import br.workshop.lab3.nosql.shoppingcart.ItemShoppingCartResponse;
import br.workshop.lab3.nosql.shoppingcart.ShoppingCartResponse;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.List;

@Schema
public record OrderRequest(
        @Schema String paymentTransaction,
        @Schema Long customerId,
        @Schema List<ItemShoppingCartResponse> items,
        @Schema BigDecimal total
) {
}
