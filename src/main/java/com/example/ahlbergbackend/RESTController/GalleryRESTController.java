package com.example.ahlbergbackend.RESTController;


import com.example.ahlbergbackend.model.GalleryModel;
import com.example.ahlbergbackend.repos.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class GalleryRESTController {

    @Autowired
    GalleryRepository galleryRepository;

    @GetMapping("/gallery")
    public List<GalleryModel> getGallery(){
        return galleryRepository.findAll();
    }

    @PutMapping(value ="/gallery", consumes = "application/json")
    public ResponseEntity<GalleryModel> updateGallery(@RequestBody GalleryModel galleryModel){
        Optional<GalleryModel> data = galleryRepository.findById(galleryModel.getGalleryModelId());
        if(data.isPresent()){
            GalleryModel updatedGallery = data.get();
            updatedGallery.setHeadline(galleryModel.getHeadline());
            galleryRepository.save(updatedGallery);
        }
        return new ResponseEntity<>(galleryModel, HttpStatus.OK);
    }
}
