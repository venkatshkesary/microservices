package com.innominds.rabbitmq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.innominds.rabbitmq.model.MessageDetails;


@Component
public class RabbitMqProducer {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${jsa.rabbitmq.queue}")
	private String queueName;
	@Value("${jsa.rabbitmq.exchange}")
	private String exchange;
	@Value("${jsa.rabbitmq.routingkey}")
	private String routingkey;
	
	long countSendMsg = 1;

	public void produce(MessageDetails messageDetails) {
		amqpTemplate.convertAndSend(exchange, routingkey, messageDetails);
		System.out.println("message has send  :"+countSendMsg+" ---   times");
	    countSendMsg++;
	}
}
