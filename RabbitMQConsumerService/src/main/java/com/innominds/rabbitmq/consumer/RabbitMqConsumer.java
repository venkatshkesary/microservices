package com.innominds.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.innominds.rabbitmq.model.MessageDetails;

@Component
public class RabbitMqConsumer {
	
	long count = 1;
    @RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="rabbitListenerContainerFactory")
    public void receivedMessage(MessageDetails messageDetails) {
    	if(count==1000) {
        System.out.println("Message Recieved ---- "+messageDetails+" \n --- "+count+" -- times");
    	}
        count++;
    }

}
