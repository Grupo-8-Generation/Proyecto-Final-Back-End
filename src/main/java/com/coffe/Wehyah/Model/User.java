package com.coffe.Wehyah.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "user_id")

    private Integer userId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;


    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "identification_type")
    private String identificationType;

    @Column(name = "dentification_number")

    private Integer dentificationNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "is_admin")

    private Boolean isAdmin;

    @OneToMany(mappedBy = "user")
    private List<TokenizedCard> tokenizedCards;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

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