package com.example.ahlbergbackend.RESTController;


import com.example.ahlbergbackend.model.AboutModel;
import com.example.ahlbergbackend.model.IndexModel;
import com.example.ahlbergbackend.repos.AboutRepository;
import com.example.ahlbergbackend.repos.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class AboutRESTController {

    @Autowired
    AboutRepository aboutRepository;

    @GetMapping("/about")
    public List<AboutModel> getIndex(){
        return aboutRepository.findAll();
    }

    @PutMapping(value ="/about", consumes = "application/json")
    public ResponseEntity<AboutModel> updateAbout(@RequestBody AboutModel aboutModel){
        Optional<AboutModel> data = aboutRepository.findById(aboutModel.getAboutModelId());
        if(data.isPresent()){
            AboutModel updatedAbout = data.get();
            updatedAbout.setHeadline(aboutModel.getHeadline());
            updatedAbout.setDescription(aboutModel.getDescription());
            aboutRepository.save(updatedAbout);
        }
        return new ResponseEntity<>(aboutModel, HttpStatus.OK);
    }
}
