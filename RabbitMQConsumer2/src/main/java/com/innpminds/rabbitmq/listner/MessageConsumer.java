package com.innpminds.rabbitmq.listner;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    long count = 1;
    @RabbitListener(queues="${javainuse.rabbitmq.queue}", containerFactory="rabbitListenerContainerFactory")
    public void receivedMessage(String createEmployeeRequest) {
        System.out.println("Message Recieved ---- "+createEmployeeRequest+" --- "+count+" -- times");
        count++;
    }
}
