package com.minicurso.unicentro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("connection")
public class ConnectionController {

    @GetMapping(path="/status")
    public ResponseEntity<String> status(){
        return ResponseEntity.ok("Status: Funcionando");
    }
}
