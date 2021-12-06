package com.example.ahlbergbackend.repos;

import com.example.ahlbergbackend.model.GalleryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GalleryRepository extends JpaRepository<GalleryModel, Integer> {
}
