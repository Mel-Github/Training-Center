package com.istio.oauth2.controller;

import com.istio.oauth2.domain.Student;
import com.istio.oauth2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value={"/"})
    public String getRoot(){
        return "alive";
    }


    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {

        return studentService.save(student);
    }
}
