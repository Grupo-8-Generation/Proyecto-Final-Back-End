package com.coffe.Wehyah.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    private String description;

    private String image;

    private double price;


    @Column(name = "quantity_available")
    private int quantityAvailable;

    @ManyToOne
    @JoinColumn(name = "car_items_id")
    private CartItems cartItems;

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