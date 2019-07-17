package com.minicurso.unicentro.controller;

import com.minicurso.unicentro.model.Student;
import com.minicurso.unicentro.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping(path="")
    public @ResponseBody ResponseEntity<Iterable<Student>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping(path="")
    public @ResponseBody ResponseEntity<Student> create(@RequestBody Student entity) {
        entity = repository.save(entity);

        return ResponseEntity.ok(entity);
    }

}
