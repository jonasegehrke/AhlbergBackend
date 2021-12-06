package com.example.ahlbergbackend.RESTController;


import com.example.ahlbergbackend.model.IndexModel;
import com.example.ahlbergbackend.repos.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class IndexRESTController {

    @Autowired
    IndexRepository indexRepository;

    @GetMapping("/index")
    public List<IndexModel> getIndex(){
        return indexRepository.findAll();
    }

    @PutMapping(value ="/index", consumes = "application/json")
    public ResponseEntity<IndexModel> updateShift(@RequestBody IndexModel indexModel){
        Optional<IndexModel> data = indexRepository.findById(indexModel.getIndexModelId());
        if(data.isPresent()){
            IndexModel updatedIndex = data.get();
            updatedIndex.setHeadline(indexModel.getHeadline());
            updatedIndex.setDescription1(indexModel.getDescription1());
            updatedIndex.setDescription2(indexModel.getDescription2());
            indexRepository.save(updatedIndex);
        }
        return new ResponseEntity<>(indexModel, HttpStatus.OK);
    }

}
