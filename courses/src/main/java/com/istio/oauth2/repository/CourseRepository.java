package com.istio.oauth2.repository;

import com.istio.oauth2.domain.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CourseRepository extends CrudRepository<Course, Long>{

}
