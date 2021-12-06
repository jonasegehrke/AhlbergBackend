package com.example.ahlbergbackend.repos;

import com.example.ahlbergbackend.model.TourPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourPageRepository extends JpaRepository<TourPage, Integer> {

}
