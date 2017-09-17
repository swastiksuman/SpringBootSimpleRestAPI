package com.springframework.pandacourse.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springframework.pandacourse.controllers.Course;

public interface CourseRepository extends CrudRepository<Course, String>{
	public List<Course> findByTopicId(String topicId);
}
