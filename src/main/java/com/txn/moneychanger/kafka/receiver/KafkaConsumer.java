package com.txn.moneychanger.kafka.receiver;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class KafkaConsumer {

	//@KafkaListener(topics = "test", groupId="group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

	/*// @KafkaListener(topics = "test", containerFactory =
	// "userKafkaListenerFactory")
	public void consumeJson(String user) {
		System.out.println("Consumed JSON Message: " + user);
	}*/
}
