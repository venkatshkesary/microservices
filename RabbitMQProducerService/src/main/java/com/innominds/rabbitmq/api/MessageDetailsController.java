package com.innominds.rabbitmq.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.innominds.rabbitmq.model.MessageDetails;
import com.innominds.rabbitmq.producer.RabbitMqProducer;

@RestController
public class MessageDetailsController {

	@Autowired
	private RabbitMqProducer rabbitMqProducer;
	@PostMapping("send")
	public MessageDetails save(@RequestBody MessageDetails msgdtls) {
		//System.out.println(msgdtls);
		for(int i=1;i<=10000;i++) {
		rabbitMqProducer.produce(msgdtls);
		}
		System.out.println();
		return msgdtls;
	}
}
