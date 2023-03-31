package com.vishnu.kafkaspring.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	
	@KafkaListener(topics = "kafkatopic1" , groupId = "kafka_group")
	public void listenToTopic(String receivedmessage) {
		
		System.out.println("The received meassage"+receivedmessage);
		 
	}

}
