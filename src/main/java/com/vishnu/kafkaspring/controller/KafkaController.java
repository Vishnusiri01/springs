package com.vishnu.kafkaspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vishnu.kafkaspring.service.Producer;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {
	@Autowired
	private Producer producer;
	
	@GetMapping("/producer")
	public void postmessage(@RequestParam("message") String message) {
		
		producer.sendMessage(message);

}

}