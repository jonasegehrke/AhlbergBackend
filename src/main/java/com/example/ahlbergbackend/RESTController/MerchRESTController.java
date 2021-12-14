package com.example.ahlbergbackend.RESTController;

import com.example.ahlbergbackend.model.Merch;
import com.example.ahlbergbackend.repos.MerchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MerchRESTController {

    @Autowired
    MerchRepository merchRepository;

    @GetMapping("/merch")
    public List<Merch> getAllMerch(){
        return merchRepository.findAll();
    }

    @PostMapping(value = "/merch", consumes = "application/json")
    public ResponseEntity<Merch> addMerch(@RequestBody Merch merch){
        merchRepository.save(merch);
        return new ResponseEntity<>(merch, HttpStatus.CREATED);
    }
    @DeleteMapping(value = "/merch/{id}")
    public ResponseEntity<Merch> deleteMerch(@PathVariable int id){
        merchRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
