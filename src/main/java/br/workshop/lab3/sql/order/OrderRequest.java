package br.workshop.lab3.sql.order;

import java.util.List;

public class OrderRequest {
    private Long customerId;
    private String paymentTransaction;
    private List<ItemRequest> items;

    // Construtores, getters e setters

    public OrderRequest() {
    }

    public OrderRequest(Long customerId, String paymentTransaction, List<ItemRequest> items) {
        this.customerId = customerId;
        this.paymentTransaction = paymentTransaction;
        this.items = items;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getPaymentTransaction() {
        return paymentTransaction;
    }

    public void setPaymentTransaction(String paymentTransaction) {
        this.paymentTransaction = paymentTransaction;
    }

    public List<ItemRequest> getItems() {
        return items;
    }

    public void setItems(List<ItemRequest> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "customerId='" + customerId + '\'' +
                ", paymentTransaction='" + paymentTransaction + '\'' +
                ", items=" + items +
                '}';
    }
}
