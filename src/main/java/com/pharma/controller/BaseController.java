package com.pharma.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pharma")
public class BaseController {

    @GetMapping
    public ResponseEntity<?> getMessage(){
        return ResponseEntity.ok("Welcome to Pharma Page");
    }

}
