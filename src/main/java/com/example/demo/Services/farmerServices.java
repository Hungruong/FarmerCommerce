package com.example.demo.Services;

import com.example.demo.Models.Farmer;
import com.example.demo.Models.Product;
import com.example.demo.Repository.farmerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class farmerServices implements IfarmerServices{

    @Autowired
    private farmerRepo farmerRepository;

    @Override
    public Farmer createFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    @Override
    public Farmer updateFarmer(int id, Farmer updatedFarmer) {
        Farmer existingFarmer = farmerRepository.findById(id).orElse(null);
        if (existingFarmer != null) {
            existingFarmer.setFarmerName(updatedFarmer.getFarmerName());
            existingFarmer.setFarmerMail(updatedFarmer.getFarmerMail());
            existingFarmer.setFarmerMobile(updatedFarmer.getFarmerMobile());
            return farmerRepository.save(existingFarmer);
        }
        return null;
    }
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
    @Override
    public Product addProduct(int farmerId, Product product) {
        Farmer farmer = farmerRepository.findById(farmerId).orElse(null);
        if (farmer != null) {
            farmerRepository.save(product);
            return product;
        }
        return null;
    }

    @Override
    public Product updateProduct(int farmerId, int productId, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(int farmerId, int productId) {

    }

    @Override
    public void changeProductPrice(int farmerId, int productId, double newPrice) {

    }

    @Override
    public void changeProductQuantity(int farmerId, int productId, int newQuantity) {

    }
}
