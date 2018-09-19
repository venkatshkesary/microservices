package com.innominds.rabbitmq.model;

public class PurchaseLedgerDetails {
	
	
	private String voucherCode;
	private String voucherAuthor;
	private String voucherPostedBy;
	private String transactionDate;
	private String accrualDate;
	private String dueDate;
	private String paymentDate;
	private String postedDate;
	private String paymentMethod;
	private boolean paid;
	private String paymentReference;
	private boolean manual;
	private boolean posted;
	private boolean approved;
	private int noOfInvoices;
	private double paymentAmount;
	public String getVoucherCode() {
		return voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}
	public String getVoucherAuthor() {
		return voucherAuthor;
	}
	public void setVoucherAuthor(String voucherAuthor) {
		this.voucherAuthor = voucherAuthor;
	}
	public String getVoucherPostedBy() {
		return voucherPostedBy;
	}
	public void setVoucherPostedBy(String voucherPostedBy) {
		this.voucherPostedBy = voucherPostedBy;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getAccrualDate() {
		return accrualDate;
	}
	public void setAccrualDate(String accrualDate) {
		this.accrualDate = accrualDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	public String getPaymentReference() {
		return paymentReference;
	}
	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}
	public boolean isManual() {
		return manual;
	}
	public void setManual(boolean manual) {
		this.manual = manual;
	}
	public boolean isPosted() {
		return posted;
	}
	public void setPosted(boolean posted) {
		this.posted = posted;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public int getNoOfInvoices() {
		return noOfInvoices;
	}
	public void setNoOfInvoices(int noOfInvoices) {
		this.noOfInvoices = noOfInvoices;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	@Override
	public String toString() {
		return "PurchaseLedgerDetails [voucherCode=" + voucherCode + ", voucherAuthor=" + voucherAuthor
				+ ", voucherPostedBy=" + voucherPostedBy + ", transactionDate=" + transactionDate + ", accrualDate="
				+ accrualDate + ", dueDate=" + dueDate + ", paymentDate=" + paymentDate + ", postedDate=" + postedDate
				+ ", paymentMethod=" + paymentMethod + ", paid=" + paid + ", paymentReference=" + paymentReference
				+ ", manual=" + manual + ", posted=" + posted + ", approved=" + approved + ", noOfInvoices="
				+ noOfInvoices + ", paymentAmount=" + paymentAmount + "]";
	}
	

	
}
