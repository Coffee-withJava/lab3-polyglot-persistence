package br.workshop.lab3.sql.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class OrderResponse {

    private Long id;
    private Long customerId;
    private String paymentTransaction;
    private List<ItemResponse> items;
    private LocalDateTime orderDate;
    private BigDecimal total;

    // Construtores, getters e setters

    public OrderResponse() {
    }

    public OrderResponse(Long id, Long customerId, String paymentTransaction, LocalDateTime orderDate, List<ItemResponse> items, BigDecimal total) {
        this.id = id;
        this.customerId = customerId;
        this.paymentTransaction = paymentTransaction;
        this.orderDate = orderDate;
        this.items = items;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<ItemResponse> getItems() {
        return items;
    }

    public void setItems(List<ItemResponse> items) {
        this.items = items;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "SavedOrderDTO{" +
                "customerId=" + customerId +
                ", paymentTransaction='" + paymentTransaction + '\'' +
                ", items=" + items +
                ", orderDate=" + orderDate +
                ", total=" + total +
                '}';
    }
}
