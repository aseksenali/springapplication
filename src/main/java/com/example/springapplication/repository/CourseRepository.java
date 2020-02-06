package com.example.springapplication.repository;

import com.example.springapplication.model.Course;
import com.example.springapplication.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    List<Course> getCoursesByTopicId(String topic_id);
}
