package com.springframework.pandacourse.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.pandacourse.controllers.Topic;
import com.springframework.pandacourse.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("100", "Physics", "Physics Related"),
			new Topic("101", "Mathematics", "Mathematics Related")));
	
	public List<Topic> getAllTopic(){
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(t -> topics.add(t));
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}

	public void deleteTopic(String id) {
		topics.removeIf(topic -> topic.getId().equals(id));
	}

	public void updateTopic(String id, Topic topic) {
		for(Topic eachTopic: topics){
			topics.removeIf(t -> t.getId().equals(id));
			topics.add(topic);
		}
	}
}
