package com.example.ahlbergbackend.repos;


import com.example.ahlbergbackend.model.IndexModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexRepository extends JpaRepository<IndexModel, Integer> {
}
