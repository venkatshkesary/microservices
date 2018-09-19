package com.javainuse.springrabbitmqexample.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.javainuse.springrabbitmqexample.model.Employee;

@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;

	@Value("${javainuse.rabbitmq.exchange}")
	String exchange;

	@Value("${javainuse.rabbitmq.routingkey}")
	private String routingkey;

	//String message = "{\"timestamp\":\"2018-09-11T08:25:00.297Z\",\"invoice\":{\"id\":\"5b977bdce4b09a01aead3af8\",\"created\":\"2018-09-11T08:25:00.293Z\",\"updated\":\"2018-09-11T08:25:00.293Z\",\"version\":0,\"projectId\":\"5b977b22e4b0ef97ac9010f8\",\"reviewStatus\":\"APPROVED\",\"description\":\"NA\",\"vendorName\":\"HIREGENICS INC\",\"vendorCode\":\"95112156\",\"vendorInvoiceNumber\":\"PPGIN00261591\",\"vendorInvoiceDate\":\"2016-10-07T00:00:00.000Z\",\"parentCompanyCode\":\"US04\",\"companyCode\":\"US04\",\"purchaseLedgerDetails\":{\"voucherCode\":null,\"voucherAuthor\":null,\"voucherPostedBy\":null,\"transactionDate\":\"2016-10-14T00:00:00.000Z\",\"accrualDate\":null,\"dueDate\":\"2017-01-10T00:00:00.000Z\",\"paymentDate\":null,\"postedDate\":null,\"paymentMethod\":null,\"paid\":false,\"paymentReference\":\"2400038076\",\"manual\":false,\"posted\":false,\"approved\":false,\"noOfInvoices\":0,\"paymentAmount\":0.0},\"shipToAddress\":null,\"shipFromAddress\":null,\"grossValue\":1132.8,\"discount\":0.0,\"taxPaid\":0.0,\"useTax\":67.97,\"totalTax\":67.97,\"netValue\":1200.77,\"taxAnalysis\":[{\"jurisdictionCode\":\"PA\",\"paid\":{\"date\":null,\"taxable\":1132.8,\"amount\":0.0,\"rate\":0.0},\"estimated\":{\"date\":\"2017-08-31T00:00:00.000Z\",\"taxable\":0.0,\"amount\":0.0,\"rate\":0.0},\"approved\":null,\"total\":{\"date\":\"2018-09-11T08:25:00.288Z\",\"taxable\":1132.8,\"amount\":67.97,\"rate\":6.0},\"use\":{\"date\":null,\"taxable\":1132.8,\"amount\":67.97,\"rate\":6.0},\"dateTimePresented\":null,\"taxability\":{\"dateTimeAdded\":null,\"addedBy\":null,\"confidence\":0.0,\"status\":\"REFUND\"},\"exemptions\":[{\"dateTimeAdded\":\"2018-09-11T08:25:00.288Z\",\"addedBy\":\"Import Process\",\"exemptionId\":\"5b977bdce4b09a01aead3af7\",\"categoryCode\":\"NONTAXABLE SERVICES\",\"jurisdictionCode\":\"PA\",\"statuteCode\":null,\"confidence\":100.0}],\"outOfStatuteDate\":null}],\"documentCount\":0,\"notes\":[],\"customFields\":[{\"group\":\"Invoice\",\"name\":\"Linked Document Location\",\"value\":\"\",\"type\":\"STRING\"},{\"group\":\"Invoice\",\"name\":\"Cluster_Count\",\"value\":\"130\",\"type\":\"INTEGER\"}],\"flags\":[],\"glAccounts\":[],\"toggleMode\":\"INVOICE\",\"hasSourceDiscrepancies\":false,\"new\":false}}";
	long countSendMsg = 1;

	public void send(Employee employee) {
		rabbitTemplate.convertAndSend(exchange, routingkey, employee);
		System.out.println("Send msg = " + employee+" \n "+countSendMsg+" ---   times");
	    countSendMsg++;
	}
}