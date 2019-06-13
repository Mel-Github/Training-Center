package com.istio.oauth2.service.impl;

import com.istio.oauth2.domain.Student;
import com.istio.oauth2.repository.StudentRepository;
import com.istio.oauth2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public Student save(Student student){
        return studentRepository.save(student);
    }

}
