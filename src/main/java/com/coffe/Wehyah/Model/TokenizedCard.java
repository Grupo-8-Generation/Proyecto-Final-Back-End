package com.coffe.Wehyah.Model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name ="TokenizedCards")
public class TokenizedCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cardToken;
    private String paymentMethod;
    private String maskedCardNumber;
    private Date expirationDate;
    @ManyToOne
    private User user;
    public TokenizedCard(){

    }


    public TokenizedCard(Integer id, String cardToken, String paymentMethod, String maskedCardNumber, Date expirationDate, User user) {
        this.id = id;
        this.cardToken = cardToken;
        this.paymentMethod = paymentMethod;
        this.maskedCardNumber = maskedCardNumber;
        this.expirationDate = expirationDate;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardToken() {
        return cardToken;
    }

    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "TokenizedCard{" +
                "id=" + id +
                ", cardToken='" + cardToken + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", maskedCardNumber='" + maskedCardNumber + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
