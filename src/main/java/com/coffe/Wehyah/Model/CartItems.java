package com.coffe.Wehyah.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carItemsId;
    private Integer productsCuantity;
    private double itemTotalPrice;
    @OneToOne
    private Order order;
  //  @OneToMany(mappedBy = "cartItems")
  //  private List<Product> products;

    public CartItems(){

    }

    public CartItems(Integer carItemsId, Integer productsCuantity, double itemTotalPrice) {
        this.carItemsId = carItemsId;
        this.productsCuantity = productsCuantity;
        this.itemTotalPrice = itemTotalPrice;
    }

    public Integer getCarItemsId() {
        return carItemsId;
    }

    public void setCarItemsId(Integer carItemsId) {
        this.carItemsId = carItemsId;
    }

    public Integer getProductsCuantity() {
        return productsCuantity;
    }

    public void setProductsCuantity(Integer productsCuantity) {
        this.productsCuantity = productsCuantity;
    }

    public double getItemTotalPrice() {
        return itemTotalPrice;
    }

    public void setItemTotalPrice(double itemTotalPrice) {
        this.itemTotalPrice = itemTotalPrice;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

 /*   public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }*/

    @Override
    public String toString() {
        return "CartItems{" +
                "carItemsId=" + carItemsId +
                ", productsCuantity=" + productsCuantity +
                ", itemTotalPrice=" + itemTotalPrice +
                '}';
    }
}
