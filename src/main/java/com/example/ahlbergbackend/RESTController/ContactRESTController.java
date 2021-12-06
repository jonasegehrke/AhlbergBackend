package com.example.ahlbergbackend.RESTController;


import com.example.ahlbergbackend.model.ContactModel;
import com.example.ahlbergbackend.repos.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class ContactRESTController {

    @Autowired
    ContactRepository contactRepository;

    @GetMapping("/contact")
    public List<ContactModel> getContact(){
        return contactRepository.findAll();
    }

    @PutMapping(value ="/contact", consumes = "application/json")
    public ResponseEntity<ContactModel> updateShift(@RequestBody ContactModel contactModel){
        Optional<ContactModel> data = contactRepository.findById(contactModel.getContactId());
        if(data.isPresent()){
            ContactModel updatedContact = data.get();
            updatedContact.setContactHeadline(contactModel.getContactHeadline());
            updatedContact.setContactDescription(contactModel.getContactDescription());
            updatedContact.setEmail(contactModel.getEmail());
            contactRepository.save(updatedContact);
        }
        return new ResponseEntity<>(contactModel, HttpStatus.OK);
    }
}
