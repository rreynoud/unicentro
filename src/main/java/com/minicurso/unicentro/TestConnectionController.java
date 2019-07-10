package com.minicurso.unicentro;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
@RequestMapping("test-connection")
public class TestConnectionController {

    String MESSAGE = "ok";
    String FIELD_STATUS = "status";

    @GetMapping
    public ResponseEntity<HashMap<String, String>> testConnection(){

        HashMap<String, String> result = new HashMap<>();
        result.put(FIELD_STATUS, MESSAGE);

        return ResponseEntity.ok(result);
    }
}
