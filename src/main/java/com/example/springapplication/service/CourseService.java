package com.example.springapplication.service;

import com.example.springapplication.model.Course;
import com.example.springapplication.repository.CourseRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {
    @Setter(onMethod = @__(@Autowired))
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String id) {
        return courseRepository.getCoursesByTopicId(id);
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
