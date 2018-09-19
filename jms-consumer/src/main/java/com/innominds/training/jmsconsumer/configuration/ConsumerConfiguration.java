package com.innominds.training.jmsconsumer.configuration;

import javax.jms.ConnectionFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;

import com.innominds.training.jmsconsumer.listener.GreetingsListener;
import com.rabbitmq.jms.admin.RMQConnectionFactory;

@Configuration
public class ConsumerConfiguration {

    @Value("${innominds.rabbitmq.host}")
    private String host;

    @Value("${innominds.rabbitmq.port}")
    private int port;

    @Value("${innominds.queue.greetings}")
    private String greetingsDestinationQueue;

    @Bean
    public ConnectionFactory connectionFactory() {
        final RMQConnectionFactory connectionFactory = new RMQConnectionFactory();
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
        connectionFactory.setUsername("myspacenx");
        connectionFactory.setPassword("myspacenx");
        return connectionFactory;
    }

    @Bean
    public DefaultMessageListenerContainer jmsListener() {
        DefaultMessageListenerContainer listenerContainer = new DefaultMessageListenerContainer();
        listenerContainer.setConnectionFactory(connectionFactory());
        listenerContainer.setDestinationName(greetingsDestinationQueue);
        listenerContainer.setPubSubDomain(false);

        final MessageListenerAdapter messageListenerAdapter = new MessageListenerAdapter(new GreetingsListener());
        messageListenerAdapter.setDefaultListenerMethod("handleMessage");

        listenerContainer.setMessageListener(messageListenerAdapter);
        return listenerContainer;
    }
}
