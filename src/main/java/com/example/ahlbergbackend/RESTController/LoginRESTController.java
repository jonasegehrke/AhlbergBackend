package com.example.ahlbergbackend.RESTController;

import com.example.ahlbergbackend.model.Login;
import com.example.ahlbergbackend.repos.LoginRepository;
import com.example.ahlbergbackend.service.LoginService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class LoginRESTController {

    @Autowired
    LoginRepository loginRepository;

    @PostMapping(value = "/login", consumes = "application/json")
    public ResponseEntity<Boolean> login(@RequestBody Login login){

        List<Login> data = loginRepository.findAll();
        LoginService loginService = new LoginService();
        Boolean loginStatus = loginService.login(login, data);

        return new ResponseEntity<Boolean>(loginStatus, HttpStatus.OK);
    }
}
