package com.example.ahlbergbackend.repos;

import com.example.ahlbergbackend.model.ContactModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<ContactModel, Integer> {
}
