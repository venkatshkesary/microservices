package com.innpminds.rabbitmq.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.innpminds.rabbitmq.producer.Producer;

@RestController
public class ProducerController {

	@Autowired
	private Producer producer;
	
	@RequestMapping("/send")
	public String sendMsg(@RequestParam("msg")String msg) {
		
		
		producer.produceMsg(msg);
		
		
		return "ur message has send";
	}
}
