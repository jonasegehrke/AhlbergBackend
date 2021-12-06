package com.example.ahlbergbackend.repos;

import com.example.ahlbergbackend.model.AboutModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<AboutModel, Integer> {
}
