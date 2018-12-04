package com.qa.util;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.persistence.domain.BabyName;
import com.qa.service.ConsumerService;

@Component
public class BabyNameReceiver {
	
	@Autowired
	private ConsumerService service;

	@JmsListener(destination = "BabyNames", containerFactory = "myFactory")
	public void receiveMessage(BabyName babyname) {
		babyname.set_id(ObjectId.get());
		service.add(babyname);
	}
}
