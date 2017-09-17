package com.springframework.pandacourse.repository;

import org.springframework.data.repository.CrudRepository;

import com.springframework.pandacourse.controllers.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{
	
}
