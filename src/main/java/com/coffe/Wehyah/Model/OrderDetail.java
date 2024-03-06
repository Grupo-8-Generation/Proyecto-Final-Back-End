package com.coffe.Wehyah.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private Integer OrderDetailID;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "total_amount")
    private double totalAmount;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "purchaceStatus")
    private String purchaceStatus;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToOne
    @JoinColumn(name = "car_items_id")
    private CartItems cartItems;
//    public OrderDetail(){
//
//    }
//
//    public OrderDetail(Integer orderDetailID, String address, String city, String country, Date purchaseDate, double totalAmount, String paymentMethod, String purchaceStatus) {
//        OrderDetailID = orderDetailID;
//        this.address = address;
//        this.city = city;
//        this.country = country;
//        this.purchaseDate = purchaseDate;
//        this.totalAmount = totalAmount;
//        this.paymentMethod = paymentMethod;
//        this.purchaceStatus = purchaceStatus;
//    }
//
//    public Integer getOrderDetailID() {
//        return OrderDetailID;
//    }
//
//    public void setOrderDetailID(Integer orderDetailID) {
//        OrderDetailID = orderDetailID;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public Date getPurchaseDate() {
//        return purchaseDate;
//    }
//
//    public void setPurchaseDate(Date purchaseDate) {
//        this.purchaseDate = purchaseDate;
//    }
//
//    public double getTotalAmount() {
//        return totalAmount;
//    }
//
//    public void setTotalAmount(double totalAmount) {
//        this.totalAmount = totalAmount;
//    }
//
//    public String getPaymentMethod() {
//        return paymentMethod;
//    }
//
//    public void setPaymentMethod(String paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//
//    public String getPurchaceStatus() {
//        return purchaceStatus;
//    }
//
//    public void setPurchaceStatus(String purchaceStatus) {
//        this.purchaceStatus = purchaceStatus;
//    }
//
//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//
//    public CartItems getCartItems() {
//        return cartItems;
//    }
//
//    public void setCartItems(CartItems cartItems) {
//        this.cartItems = cartItems;
//    }

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
