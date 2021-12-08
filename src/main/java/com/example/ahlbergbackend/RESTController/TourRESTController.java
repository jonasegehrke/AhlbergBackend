package com.example.ahlbergbackend.RESTController;


import com.example.ahlbergbackend.model.Tour;
import com.example.ahlbergbackend.repos.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TourRESTController {

    @Autowired
    TourRepository tourRepository;


    @GetMapping("/tours")
    public List<Tour> getAllCurrentTours(){
        return tourRepository.findAll();
    }

    @PostMapping(value = "/tours", consumes = "application/json")
    public ResponseEntity<Tour> addTour(@RequestBody Tour tour){
        tourRepository.save(tour);
        return new ResponseEntity<>(tour, HttpStatus.CREATED);
    }
    @DeleteMapping(value = "/tours")
    public ResponseEntity<Tour> deleteTour(@PathVariable int id){
        tourRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
