package com.coffe.Wehyah.Model;
import jakarta.persistence.*;
import org.thymeleaf.spring6.processor.SpringErrorClassTagProcessor;

import java.util.Date;
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderID;

    private Date creationDate;
    private double totalAmount;
    private String orderStatus;
    @ManyToOne
    private User user;
    @OneToOne(mappedBy = "order")
    private OrderDetail orderDetail;


    public  Order(){

    }

    public Order(Integer orderID, Date creationDate, double totalAmount, String orderStatus) {
        this.orderID = orderID;
        this.creationDate = creationDate;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", creationDate=" + creationDate +
                ", totalAmount=" + totalAmount +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
