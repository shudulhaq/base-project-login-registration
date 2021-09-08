package com.example.baseprojectloginregistration.service;

import com.example.baseprojectloginregistration.model.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    public String register(RegistrationRequest request) {
        return "it works";
    }
}
