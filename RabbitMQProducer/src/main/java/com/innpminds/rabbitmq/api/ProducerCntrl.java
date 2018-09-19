package com.innpminds.rabbitmq.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller

public class ProducerCntrl {


	@RequestMapping("/test")
	public String data(@RequestParam("msg")String msg) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		for(int i=1;i<=1000000;i++) {
		String fooResourceUrl
		  = "http://localhost:8080/send?msg="+msg+i;
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl , String.class);
		System.out.println(response.getBody()+"---------------------------------------");
		}
		/*System.out.println("data");
		repeat();
		System.out.println("end data");*/
		
		return "res";
	}
	
	
}
