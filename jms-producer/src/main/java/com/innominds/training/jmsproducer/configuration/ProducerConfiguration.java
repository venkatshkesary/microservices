package com.innominds.training.jmsproducer.configuration;

import javax.jms.ConnectionFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rabbitmq.jms.admin.RMQConnectionFactory;

@Configuration
public class ProducerConfiguration {

    @Value("${innominds.rabbitmq.host}")
    private String host;

    @Value("${innominds.rabbitmq.port}")
    private int port;

    @Bean
    public ConnectionFactory connectionFactory() {
        final RMQConnectionFactory connectionFactory = new RMQConnectionFactory();
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
        connectionFactory.setUsername("myspacenx");
        connectionFactory.setPassword("myspacenx");
        return connectionFactory;
    }
}
