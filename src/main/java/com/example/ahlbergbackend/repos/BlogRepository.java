package com.example.ahlbergbackend.repos;

import com.example.ahlbergbackend.model.BlogModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogModel, Integer> {
}
