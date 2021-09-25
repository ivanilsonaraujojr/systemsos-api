package br.com.sossystem.api.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String state;

    @NotNull
    private String city;

    @NotNull
    private String street;

    @NotNull
    @Column(name = "zip_code")
    private String zipCode;

    @NotNull
    private String number;

    @OneToOne(mappedBy = "address")
    private User user;

    public Address() {

    }

    public Address(Long id, String state, String city, String street, String zipCode, String number, User user) {
        this.id = id;
        this.state = state;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.number = number;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
