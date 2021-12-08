package com.example.ahlbergbackend.service;

import com.example.ahlbergbackend.model.Login;
import com.example.ahlbergbackend.repos.LoginRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LoginService {

    public Boolean login(Login login, List<Login> data){

        //List<Login> data = loginRepository.findAll();
            if(Objects.equals(data.get(0).getUsername(), login.getUsername()) && Objects.equals(data.get(0).getPassword(), login.getPassword())) {
                return true;
            }
        return false;
        }
}
