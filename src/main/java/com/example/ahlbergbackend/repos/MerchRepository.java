package com.example.ahlbergbackend.repos;

import com.example.ahlbergbackend.model.Merch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchRepository extends JpaRepository<Merch, Integer> {
}
