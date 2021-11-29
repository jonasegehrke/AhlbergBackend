package com.example.ahlbergbackend.RESTController;


import com.example.ahlbergbackend.model.Tour;
import com.example.ahlbergbackend.repos.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
