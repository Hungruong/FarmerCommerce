package com.example.demo.Repository;


import com.example.demo.Models.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface farmerRepo extends JpaRepository<Farmer, Integer> {
}
