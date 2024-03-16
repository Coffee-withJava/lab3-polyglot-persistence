package br.workshop.lab3.product;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.math.BigDecimal;

@Schema
public record ProductResponse(@Schema String id,
                              @Schema String name,
                              @Schema BigDecimal price) {
}
