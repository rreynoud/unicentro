package com.minicurso.unicentro.repository;

import com.minicurso.unicentro.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudantRepository extends CrudRepository<Student, Long> {

}
