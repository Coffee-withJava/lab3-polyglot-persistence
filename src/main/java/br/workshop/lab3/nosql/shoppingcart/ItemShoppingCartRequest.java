package br.workshop.lab3.nosql.shoppingcart;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public record ItemShoppingCartRequest(@Schema String id, @Schema Integer quantity) {
}
