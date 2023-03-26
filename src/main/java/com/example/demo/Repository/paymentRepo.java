package com.example.demo.Repository;


import com.example.demo.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface paymentRepo extends JpaRepository<Payment, Integer> {
}
