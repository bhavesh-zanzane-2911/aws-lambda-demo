package org.bhavesh.service;

import org.bhavesh.dto.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private static final List<Course> courses =new ArrayList<>();

    public List<Course> getAllCourses(){
        return courses;
    }

    public Course getCourseById(int id) {
        return courses.stream()
                .filter(course -> course.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No Course Found "));
    }

    public Course addCourse(final Course course){
        courses.add(course);
        return course;
    }
}
