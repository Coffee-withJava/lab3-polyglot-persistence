package br.workshop.lab3.shoppingcart;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public record ItemShoppingCartRequest(@Schema String id, @Schema Integer quantity) {
}
