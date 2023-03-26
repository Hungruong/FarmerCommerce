package com.example.demo.Models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="Vendor")
@Data
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int vendorId;
    @Column(nullable = false)
    private String vendorUserName;
    @Column(nullable = false)
    private String vendorPassword;
    @Column(nullable = false)
    private String vendorName;
    @Column(nullable = false)
    private String vendorMobile;
    @Column(nullable = true)
    private String vendorMail;
    @Column(nullable = false)
    private String vendorAddress;
    @Column(nullable = false)
    private String vendorState;
    @Column(nullable = false)
    private boolean vendorStatus;

    @OneToOne (mappedBy = "vendor", cascade = CascadeType.ALL)
    private Order order;

    @OneToOne (mappedBy = "vendor", cascade = CascadeType.ALL)
    private Cart cart;

    @OneToOne (mappedBy = "vendor", cascade = CascadeType.ALL)
    private Payment payment;


    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorUserName() {
        return vendorUserName;
    }

    public void setVendorUserName(String vendorUserName) {
        this.vendorUserName = vendorUserName;
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorMobile() {
        return vendorMobile;
    }

    public void setVendorMobile(String vendorMobile) {
        this.vendorMobile = vendorMobile;
    }

    public String getVendorMail() {
        return vendorMail;
    }

    public void setVendorMail(String vendorMail) {
        this.vendorMail = vendorMail;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorState() {
        return vendorState;
    }

    public void setVendorState(String vendorState) {
        this.vendorState = vendorState;
    }

    public boolean isVendorStatus() {
        return vendorStatus;
    }

    public void setVendorStatus(boolean vendorStatus) {
        this.vendorStatus = vendorStatus;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
