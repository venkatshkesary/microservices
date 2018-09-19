package com.javainuse.springrabbitmqexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.springrabbitmqexample.model.Employee;
import com.javainuse.springrabbitmqexample.service.RabbitMQSender;

@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class RabbitMQWebController {

	@Autowired
	RabbitMQSender rabbitMQSender;



	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message/*@RequestParam("empName") String empName,@RequestParam("empId") String empId*/) {
	
	Employee emp=new Employee();
	/*emp.setEmpId(empId);
	emp.setEmpName(empName);
	rabbitMQSender.send(emp);*/

	emp.setMessage(message);
	rabbitMQSender.send(emp);

		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}

}