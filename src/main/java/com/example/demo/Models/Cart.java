package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private int cartId;
    @Column(nullable = false)
    private int vendorId;

    @Column(nullable = false)
    private String cartNames;

    @Column(nullable = false)
    private int cardAmounts;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

    @OneToMany(mappedBy = "cart")
    private Set<Product> products;


    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getCartNames() {
        return cartNames;
    }

    public void setCartNames(String cartNames) {
        this.cartNames = cartNames;
    }

    public int getCardAmounts() {
        return cardAmounts;
    }

    public void setCardAmounts(int cardAmounts) {
        this.cardAmounts = cardAmounts;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
