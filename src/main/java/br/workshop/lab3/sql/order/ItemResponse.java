package br.workshop.lab3.sql.order;

import java.math.BigDecimal;

public class ItemResponse {
    private String productId;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal total;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ItemResponse() {
    }

    public ItemResponse(String productId, int quantity, BigDecimal price, BigDecimal total) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "SavedItemDTO{" +
                "productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", price='" + price + '\'' +
                '}';
    }
}
