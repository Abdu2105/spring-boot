package com.example.sssss.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TransactionService {

    private final String URI = "http:/localhost:8081/api/templates/test";
    public String getMessage(){
        RestTemplate restTemplate = new RestTemplate();
        String msg = restTemplate.getForObject(URI, String.class);
        return msg;
    }
}
