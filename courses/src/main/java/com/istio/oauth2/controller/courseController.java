package com.istio.oauth2.controller;

import com.istio.oauth2.domain.Course;
import com.istio.oauth2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value={"/"})
    public String getRoot(){
        return "alive";
    }


    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {

        return courseService.save(course);
    }
}

