package com.example.demo.Models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name="Farmer")
@Data
public class Farmer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "farmer_id")
    private int farmerId;
    @Column(nullable = false)
    private String farmerUserName;
    @Column(nullable = false)
    private String farmerPassword;
    @Column(nullable = false)
    private String farmerName;
    @Column(nullable = false)
    private String farmerMobile;
    @Column(nullable = true)
    private String farmerMail;
    @Column(nullable = false)
    private String farmerAddress;
    @Column(nullable = false)
    private String farmerState;
    @Column(nullable = false)
    private boolean farmerStatus;

    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL)
    private Set<Product> products;


    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    public String getFarmerUserName() {
        return farmerUserName;
    }

    public void setFarmerUserName(String farmerUserName) {
        this.farmerUserName = farmerUserName;
    }

    public String getFarmerPassword() {
        return farmerPassword;
    }

    public void setFarmerPassword(String farmerPassword) {
        this.farmerPassword = farmerPassword;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getFarmerMobile() {
        return farmerMobile;
    }

    public void setFarmerMobile(String farmerMobile) {
        this.farmerMobile = farmerMobile;
    }

    public String getFarmerMail() {
        return farmerMail;
    }

    public void setFarmerMail(String farmerMail) {
        this.farmerMail = farmerMail;
    }

    public String getFarmerAddress() {
        return farmerAddress;
    }

    public void setFarmerAddress(String farmerAddress) {
        this.farmerAddress = farmerAddress;
    }

    public String getFarmerState() {
        return farmerState;
    }

    public void setFarmerState(String farmerState) {
        this.farmerState = farmerState;
    }

    public boolean isFarmerStatus() {
        return farmerStatus;
    }

    public void setFarmerStatus(boolean farmerStatus) {
        this.farmerStatus = farmerStatus;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
