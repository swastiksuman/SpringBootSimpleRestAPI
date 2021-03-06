package com.springframework.pandacourse.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.pandacourse.services.CourseService;

@Api(description="This provides Course Controls to get, add and delete courses.")
@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@ApiOperation(value="This lists all Courses", notes="It will provide with all the current courses.")
	@RequestMapping("/courses")
	public List<Course> getAllTopics() {
		return courseService.getAllCourse();
	}
	
	/*@RequestMapping("/course/{id}")
	public Topic getAllTopics(@PathVariable("id") String topicId) {
		System.out.println(topicId);
		return courseService.getTopic(topicId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/course")
	public void addTopic(@RequestBody Topic topic){
		courseService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/course/{id}")
	public void deleteTopic(@PathVariable String id){
		courseService.deleteTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/course/{id}")
	public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
		courseService.updateTopic(id, topic);
	}*/
}