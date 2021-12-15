package com.example.ahlbergbackend.RESTController;

import com.example.ahlbergbackend.model.MerchPage;
import com.example.ahlbergbackend.repos.MerchPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class MerchPageRESTController {

    @Autowired
    MerchPageRepository merchPageRepository;

    @GetMapping("/merchPage")
    public List<MerchPage> getMerchPage(){
        return merchPageRepository.findAll();
    }

    @PutMapping(value ="/merchPage", consumes = "application/json")
    public ResponseEntity<MerchPage> updateMerchPage(@RequestBody MerchPage merchPage){
        Optional<MerchPage> data = merchPageRepository.findById(merchPage.getMerchPageId());
        if(data.isPresent()){
            MerchPage updatedMerchPage = data.get();
            updatedMerchPage.setHeadline(merchPage.getHeadline());

            merchPageRepository.save(updatedMerchPage);
        }
        return new ResponseEntity<>(merchPage, HttpStatus.OK);
    }
}
