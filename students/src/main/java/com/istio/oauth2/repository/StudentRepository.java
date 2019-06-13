package com.istio.oauth2.repository;


import com.istio.oauth2.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface StudentRepository extends CrudRepository<Student, Long> {


}