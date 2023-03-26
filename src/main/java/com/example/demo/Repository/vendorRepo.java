package com.example.demo.Repository;

import com.example.demo.Models.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vendorRepo extends JpaRepository<Vendor, Integer> {
}
