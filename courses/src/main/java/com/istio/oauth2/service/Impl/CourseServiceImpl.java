package com.istio.oauth2.service.Impl;


import com.istio.oauth2.domain.Course;
import com.istio.oauth2.repository.CourseRepository;
import com.istio.oauth2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {


    @Autowired
    CourseRepository courseRepository;


    @Override
    public Course save(Course course){
        return courseRepository.save(course);
    }

}
