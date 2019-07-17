package com.minicurso.unicentro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("test-connection")
public class TestConnectionController {

    @GetMapping
    public ResponseEntity<String> testConnection(){
        return ResponseEntity.ok("Funcionando");
    }
}
