package com.coffe.Wehyah.Model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table
public class OrderDetail {
    public Object set;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderDetailID;
    private String address;
    private String city;
    private String country;
    private Date purchaseDate;
    private double totalAmount;
    private String paymentMethod;
    private String purchaceStatus;
    @OneToOne
    private Order order;
    @OneToOne
    private CartItems cartItems;
    public OrderDetail(){

    }

    public OrderDetail(Integer orderDetailID, String address, String city, String country, Date purchaseDate, double totalAmount, String paymentMethod, String purchaceStatus) {
        OrderDetailID = orderDetailID;
        this.address = address;
        this.city = city;
        this.country = country;
        this.purchaseDate = purchaseDate;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.purchaceStatus = purchaceStatus;
    }

    public Integer getOrderDetailID() {
        return OrderDetailID;
    }

    public void setOrderDetailID(Integer orderDetailID) {
        OrderDetailID = orderDetailID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPurchaceStatus() {
        return purchaceStatus;
    }

    public void setPurchaceStatus(String purchaceStatus) {
        this.purchaceStatus = purchaceStatus;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public CartItems getCartItems() {
        return cartItems;
    }

    public void setCartItems(CartItems cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "OrderDetailID=" + OrderDetailID +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", totalAmount=" + totalAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", purchaceStatus='" + purchaceStatus + '\'' +
                '}';
    }
}
