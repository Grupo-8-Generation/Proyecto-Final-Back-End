package com.coffe.Wehyah.Model;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Integer userId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "identificationType")
    private String identificationType;

    @Column(name = "dentificationNumber")
    private Integer dentificationNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "isAdmin")
    private Boolean isAdmin;
    @OneToMany(mappedBy = "user")
    private List<TokenizedCard> tokenizedCards;
    @OneToMany(mappedBy = "user")
    private List<Order> orders;


    public User(){

    }

    public User(Integer userId, String name, String email, String password, String phoneNumber, String identificationType, Integer dentificationNumber, String address, String city, String country, Boolean isAdmin, List<TokenizedCard> tokenizedCards) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.identificationType = identificationType;
        this.dentificationNumber = dentificationNumber;
        this.address = address;
        this.city = city;
        this.country = country;
        this.isAdmin = isAdmin;
        this.tokenizedCards = tokenizedCards;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public Integer getDentificationNumber() {
        return dentificationNumber;
    }

    public void setDentificationNumber(Integer dentificationNumber) {
        this.dentificationNumber = dentificationNumber;
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

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public List<TokenizedCard> getTokenizedCards() {
        return tokenizedCards;
    }

    public void setTokenizedCards(List<TokenizedCard> tokenizedCards) {
        this.tokenizedCards = tokenizedCards;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", identificationType='" + identificationType + '\'' +
                ", dentificationNumber=" + dentificationNumber +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
