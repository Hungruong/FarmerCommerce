package com.example.demo.Repository;


import com.example.demo.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo  extends JpaRepository<Product, Integer> {
}
