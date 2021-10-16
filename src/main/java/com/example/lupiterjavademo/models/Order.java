package com.example.lupiterjavademo.models;

public class Order {
    private int id;
    private int customerId;
    private String productTitle;
    private double price;
    private int productId;
    private int quantity;

    public Order() {
    }

    public Order(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Order(
            int id,
            int productId,
            int customerId,
            int quantity,
            double price,
            String productTitle
    ) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.customerId = customerId;
        this.price = price;
        this.productTitle = productTitle;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getProductTitle() {
        if (productTitle == null) {
            productTitle = "";
        }
        return productTitle;
    }

    public void setProductTitle(String productTitle) {

        this.productTitle = productTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
