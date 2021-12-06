package com.example.ahlbergbackend.RESTController;



import com.example.ahlbergbackend.model.TourPage;
import com.example.ahlbergbackend.repos.TourPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class TourPageRESTController {

    @Autowired
     TourPageRepository tourPageRepository;

    @GetMapping("/toursPage")
    public List<TourPage> getTourPage(){
        return tourPageRepository.findAll();
    }

    @PutMapping(value ="/toursPage", consumes = "application/json")
    public ResponseEntity<TourPage> updateTourPage(@RequestBody TourPage tourPage){
        Optional<TourPage> data = tourPageRepository.findById(tourPage.getTourPageId());
        if(data.isPresent()){
            TourPage updatedTourPage = data.get();
            updatedTourPage.setHeadline(tourPage.getHeadline());

            tourPageRepository.save(updatedTourPage);
        }
        return new ResponseEntity<>(tourPage, HttpStatus.OK);
    }

}
