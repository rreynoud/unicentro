package com.minicurso.unicentro.service;

import com.minicurso.unicentro.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    public Page<Student> findAll(Pageable pageable);

    public Student create(Student student);
}
