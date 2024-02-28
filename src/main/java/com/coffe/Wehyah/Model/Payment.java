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

@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Integer paymentID;

    @Column(name = "transaction_id")
    private Integer transactionID;

    @Column(name = "payment_date")
    private Date paymentDate;

    private double amount;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "payment_status")
    private String paymentStatus;
    @OneToOne
    @JoinColumn(name = "order_id")
    private  Order order;

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", transactionID=" + transactionID +
                ", paymentDate=" + paymentDate +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
