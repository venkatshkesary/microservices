package com.innominds.rabbitmq.model;

public class Exemptions {

	private String dateTimeAdded;
	private String addedBy;
	private String exemptionId;
	private String categoryCode;
	private String jurisdictionCode;
	private String statuteCode;
	private double confidence;
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
	public String getExemptionId() {
		return exemptionId;
	}
	public void setExemptionId(String exemptionId) {
		this.exemptionId = exemptionId;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getJurisdictionCode() {
		return jurisdictionCode;
	}
	public void setJurisdictionCode(String jurisdictionCode) {
		this.jurisdictionCode = jurisdictionCode;
	}
	public String getStatuteCode() {
		return statuteCode;
	}
	public void setStatuteCode(String statuteCode) {
		this.statuteCode = statuteCode;
	}
	public double getConfidence() {
		return confidence;
	}
	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}
	@Override
	public String toString() {
		return "Exemptions [dateTimeAdded=" + dateTimeAdded + ", addedBy=" + addedBy + ", exemptionId=" + exemptionId
				+ ", categoryCode=" + categoryCode + ", jurisdictionCode=" + jurisdictionCode + ", statuteCode="
				+ statuteCode + ", confidence=" + confidence + "]";
	}
	
	

}
