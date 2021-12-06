package com.example.ahlbergbackend.repos;

import com.example.ahlbergbackend.model.ListenModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListenRepository extends JpaRepository<ListenModel, Integer> {
}
