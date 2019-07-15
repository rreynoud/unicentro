package com.minicurso.unicentro.controller;

import com.minicurso.unicentro.model.Student;
import com.minicurso.unicentro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping(path="")
    public @ResponseBody ResponseEntity<Page<Student>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @PostMapping(path="")
    public @ResponseBody ResponseEntity<Student> create(@RequestBody Student entity) {

        entity = service.create(entity);

        return ResponseEntity.ok(entity);
    }

}
