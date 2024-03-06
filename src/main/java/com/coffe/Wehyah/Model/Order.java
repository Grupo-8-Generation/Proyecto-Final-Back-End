package com.coffe.Wehyah.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thymeleaf.spring6.processor.SpringErrorClassTagProcessor;

import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderID;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "total_amount")
    private double totalAmount;

    @Column(name = "order_status")
    private String orderStatus;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;

    @OneToOne(mappedBy = "order")
    private OrderDetail orderDetail;


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
