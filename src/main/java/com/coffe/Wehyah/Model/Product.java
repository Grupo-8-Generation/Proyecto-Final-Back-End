package com.coffe.Wehyah.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private String description;
    private String image;
    private double price;
    private int quantityAvailable;

    @ManyToOne
    @JoinColumn(name = "carItemsId")
    private CartItems cartItems;



//    public Product(){
//
//    }
//
//
//    public Product(Integer productId, String productName, String description, String image, double price, int quantityAvailable, User user) {
//        this.productId = productId;
//        this.productName = productName;
//        this.description = description;
//        this.image = image;
//        this.price = price;
//        this.quantityAvailable = quantityAvailable;
//    }
//
//    public Integer getProductId() {
//        return productId;
//    }
//
//    public void setProductId(Integer productId) {
//        this.productId = productId;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public int getQuantityAvailable() {
//        return quantityAvailable;
//    }
//
//    public void setQuantityAvailable(int quantityAvailable) {
//        this.quantityAvailable = quantityAvailable;
//    }


    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", quantityAvailable=" + quantityAvailable +

                '}';
    }
}