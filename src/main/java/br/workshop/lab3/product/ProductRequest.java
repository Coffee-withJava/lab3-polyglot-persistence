package br.workshop.lab3.product;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.math.BigDecimal;

@Schema
public record ProductRequest(@Schema String name,
                             @Schema BigDecimal price) {
}
