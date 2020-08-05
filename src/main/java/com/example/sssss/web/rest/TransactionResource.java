package com.example.sssss.web.rest;

import com.example.sssss.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class TransactionResource {

    private final TransactionService transactionService;

    public TransactionResource(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transaction")
    public ResponseEntity getMsg(){
        return ResponseEntity.ok(transactionService.getMessage());
    }
}
