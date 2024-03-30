package br.workshop.lab3.polyglot;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public record PaymentRequest(
        @Schema String paymentTransaction,
        @Schema Long customerId

) {
}
