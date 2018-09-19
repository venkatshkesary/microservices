package com.innpminds.rabbitmq.cfg;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfigs {

		@Autowired
		ConnectionFactory connectionFactory;

		@Value("${javainuse.rabbitmq.queue}")
		String queueName;

		@Value("${javainuse.rabbitmq.exchange}")
		String exchange;

		@Value("${javainuse.rabbitmq.routingkey}")
		private String routingkey;

		@Bean
		Queue queue() {
			return new Queue(queueName, false);
		}

		@Bean
		DirectExchange exchange() {
			return new DirectExchange(exchange);
		}

		@Bean
		Binding binding(Queue queue, DirectExchange exchange) {
			return BindingBuilder.bind(queue).to(exchange).with(routingkey);
		}

		/*@Bean
		public MessageConverter jsonMessageConverter() {
			return new Jackson2JsonMessageConverter();
		}*/
		
		@Bean
		public AmqpTemplate rabbitTemplate() {
			final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
			//rabbitTemplate.setMessageConverter(jsonMessageConverter());
			return rabbitTemplate;
		}

		@Bean
		public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory() {
			SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
			factory.setConnectionFactory(connectionFactory);
			//factory.setMessageConverter(jsonMessageConverter());
			factory.setDefaultRequeueRejected(false); // do not re-queue rejected messages
			factory.setTxSize(1);
			factory.setReceiveTimeout(1000L);
			factory.setConcurrentConsumers(2);
			factory.setMaxConcurrentConsumers(32);
			factory.setConsecutiveActiveTrigger(5);
			factory.setStartConsumerMinInterval(10000L);
			factory.setConsecutiveIdleTrigger(5);
			factory.setStopConsumerMinInterval(30000L);
			return factory;
		}
}
