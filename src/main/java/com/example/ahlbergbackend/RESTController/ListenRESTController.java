package com.example.ahlbergbackend.RESTController;


import com.example.ahlbergbackend.model.ListenModel;
import com.example.ahlbergbackend.repos.ListenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class ListenRESTController {

    @Autowired
    ListenRepository listenRepository;

    @GetMapping("/listen")
    public List<ListenModel> getListen(){
        return listenRepository.findAll();
    }

    @PutMapping(value ="/listen", consumes = "application/json")
    public ResponseEntity<ListenModel> updateShift(@RequestBody ListenModel listenModel){
        Optional<ListenModel> data = listenRepository.findById(listenModel.getListenId());
        if(data.isPresent()){
            ListenModel updatedListen = data.get();
            updatedListen.setListenHeadline(listenModel.getListenHeadline());
            updatedListen.setListenDescription(listenModel.getListenDescription());
            listenRepository.save(updatedListen);
        }
        return new ResponseEntity<>(listenModel, HttpStatus.OK);
    }
}
