package com.example.demo.Repository;


import com.example.demo.Models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cartRepo extends JpaRepository<Cart, Integer> {
}
