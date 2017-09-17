package com.springframework.pandacourse.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.pandacourse.controllers.Course;
import com.springframework.pandacourse.controllers.Topic;
import com.springframework.pandacourse.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourse(){
		List<Course> courses= new ArrayList<Course>();
		courseRepository.findAll().forEach(c -> courses.add(c));
		return courses;
	}
	
	/*public Topic getCourse(String id){
		return courses.stream().filter(c->c.getId().equals(id)).findFirst().get();
	}*/
	
	public void addCourse(Course course){
		
	}

	/*public void deleteCourse(String id) {
		topics.removeIf(topic -> topic.getId().equals(id));
	}*/

	/*public void updateCourse(String id, Course topic) {
		for(Course eachCourse: courses){
			courses.removeIf(c -> c.getId().equals(id));
			courses.add(topic);
		}
	}*/
}
