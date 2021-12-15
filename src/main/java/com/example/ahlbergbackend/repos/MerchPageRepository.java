package com.example.ahlbergbackend.repos;

import com.example.ahlbergbackend.model.MerchPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchPageRepository extends JpaRepository<MerchPage, Integer> {
}
