package com.example.demo.Repository;

import com.example.demo.Models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adminRepo extends JpaRepository<Admin, Integer> {
}
