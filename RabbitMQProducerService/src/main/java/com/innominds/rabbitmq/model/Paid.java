package com.innominds.rabbitmq.model;

public class Paid {

	private String date;
	private double taxable;
	private double amount;
	private double rate;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getTaxable() {
		return taxable;
	}
	public void setTaxable(double taxable) {
		this.taxable = taxable;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Paid [date=" + date + ", taxable=" + taxable + ", amount=" + amount + ", rate=" + rate + "]";
	}
	
	
}
