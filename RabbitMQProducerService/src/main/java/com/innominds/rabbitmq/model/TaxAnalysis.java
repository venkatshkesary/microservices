package com.innominds.rabbitmq.model;

import java.util.ArrayList;
import java.util.List;

public class TaxAnalysis {
	
	private String jurisdictionCode;
	private Paid paid;
	private Estimated estimated;
	private String approved;
	private Total total;
	private Use use;
	private String dateTimePresented;
	private Taxability taxability;
	private List<Exemptions> exemptions=new ArrayList<>();
	private String outOfStatuteDate;
	
	
	public String getJurisdictionCode() {
		return jurisdictionCode;
	}
	public void setJurisdictionCode(String jurisdictionCode) {
		this.jurisdictionCode = jurisdictionCode;
	}
	public Paid getPaid() {
		return paid;
	}
	public void setPaid(Paid paid) {
		this.paid = paid;
	}
	public Estimated getEstimated() {
		return estimated;
	}
	public void setEstimated(Estimated estimated) {
		this.estimated = estimated;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public Total getTotal() {
		return total;
	}
	public void setTotal(Total total) {
		this.total = total;
	}
	public Use getUse() {
		return use;
	}
	public void setUse(Use use) {
		this.use = use;
	}
	public String getDateTimePresented() {
		return dateTimePresented;
	}
	public void setDateTimePresented(String dateTimePresented) {
		this.dateTimePresented = dateTimePresented;
	}
	public Taxability getTaxability() {
		return taxability;
	}
	public void setTaxability(Taxability taxability) {
		this.taxability = taxability;
	}
	public List<Exemptions> getExemptions() {
		return exemptions;
	}
	public void setExemptions(List<Exemptions> exemptions) {
		this.exemptions = exemptions;
	}
	public String getOutOfStatuteDate() {
		return outOfStatuteDate;
	}
	public void setOutOfStatuteDate(String outOfStatuteDate) {
		this.outOfStatuteDate = outOfStatuteDate;
	}
	@Override
	public String toString() {
		return "TaxAnalysis [jurisdictionCode=" + jurisdictionCode + ", paid=" + paid + ", estimated=" + estimated
				+ ", approved=" + approved + ", total=" + total + ", use=" + use + ", dateTimePresented="
				+ dateTimePresented + ", taxability=" + taxability + ", exemptions=" + exemptions
				+ ", outOfStatuteDate=" + outOfStatuteDate + "]";
	}
	
	
	

}
