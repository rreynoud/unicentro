package com.minicurso.unicentro.service.impl;


import com.minicurso.unicentro.model.Student;
import com.minicurso.unicentro.repository.StudantRepository;
import com.minicurso.unicentro.service.StudantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudantServiceIMPL implements StudantService {

    @Autowired
    private StudantRepository repository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) repository.findAll();
    }

}
