package com.springframework.pandacourse.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.pandacourse.services.TopicService;

@Api(description="This provides Topics Controls to get, add and delete topics.")
@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@ApiOperation(value="This lists all Courses", notes="It will provide with all the current courses.")
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopic();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getAllTopics(@PathVariable("id") String topicId) {
		System.out.println(topicId);
		return topicService.getTopic(topicId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topic")
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topic/{id}")
	public void deleteTopic(@PathVariable String id){
		topicService.deleteTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topic/{id}")
	public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
		topicService.updateTopic(id, topic);
	}
}