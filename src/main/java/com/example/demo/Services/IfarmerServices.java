package com.example.demo.Services;

import com.example.demo.Models.Farmer;
import com.example.demo.Models.Product;

import java.util.List;

public interface IfarmerServices {
        Farmer createFarmer(Farmer farmer);
        Farmer updateFarmer(int id, Farmer updatedFarmer);
        Product addProduct(int farmerId, Product product);
        Product updateProduct(int farmerId, int productId, Product product);
        void deleteProduct(int farmerId, int productId);
        void changeProductPrice(int farmerId, int productId, double newPrice);
        void changeProductQuantity(int farmerId, int productId, int newQuantity);
}
