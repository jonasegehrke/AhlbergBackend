package com.example.ahlbergbackend.repos;

import com.example.ahlbergbackend.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, Integer> {

}
