package com.innominds.rabbitmq.model;

public class Taxability {
	
	private String dateTimeAdded;
	private String addedBy;
	private double confidence;
	private String status;
	public String getDateTimeAdded() {
		return dateTimeAdded;
	}
	public void setDateTimeAdded(String dateTimeAdded) {
		this.dateTimeAdded = dateTimeAdded;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public double getConfidence() {
		return confidence;
	}
	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Taxability [dateTimeAdded=" + dateTimeAdded + ", addedBy=" + addedBy + ", confidence=" + confidence
				+ ", status=" + status + "]";
	}
	

	
}
