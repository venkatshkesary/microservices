package com.innominds.rabbitmq.model;

import java.io.Serializable;

public class MessageDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//private int id;
	
	private String timestamp;
	private Invoice invoice;
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	@Override
	public String toString() {
		return "MessageDetails [timestamp=" + timestamp + ", invoice=" + invoice + "]";
	}
	
	
	
	
	
	 

}
