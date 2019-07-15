package com.minicurso.unicentro.service.impl;


import com.minicurso.unicentro.model.Student;
import com.minicurso.unicentro.repository.StudentRepository;
import com.minicurso.unicentro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Page<Student> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Student create(Student create) {
        return repository.save(create);
    }

}
