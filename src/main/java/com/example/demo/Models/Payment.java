package com.example.demo.Models;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int paymentid;
    @Column(nullable = false)
    private int amount;
    @Column(nullable = false)
    private String billingAddress;
    @Column(nullable = false)
    private LocalDate paymentDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "order_id", referencedColumnName = "Order")
    private Order order;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "vendor_id", referencedColumnName = "Vendor")
    private Vendor vendor;


    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
