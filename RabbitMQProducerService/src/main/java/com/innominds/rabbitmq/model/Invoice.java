package com.innominds.rabbitmq.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Invoice implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String created;
	private String updated;
	private int version;
	private String projectId;
	private String reviewStatus;
	private String description;
	private String vendorName;
	private String vendorCode;
	private String vendorInvoiceNumber;
	private String vendorInvoiceDate;
	private String parentCompanyCode;
	private String companyCode;
	private PurchaseLedgerDetails purchaseLedgerDetails;
	private String shipToAddress;
	private String shipFromAddress;
	private double grossValue;
	private double discount;
	private double taxPaid;
	private double useTax;
	private double totalTax;
	private double netValue;
	private List<TaxAnalysis> taxAnalysis=new ArrayList<>();
	private int documentCount;
	private List<Notes> notes=new ArrayList<>();
	private List<CustomFields> customFields=new ArrayList<>();
	private List<Flags> flags=new ArrayList<>();
	private List<GlAccounts> glAccounts=new ArrayList<>();
	private String toggleMode;
	private boolean hasSourceDiscrepancies;
	private boolean new_one;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getReviewStatus() {
		return reviewStatus;
	}
	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getVendorInvoiceNumber() {
		return vendorInvoiceNumber;
	}
	public void setVendorInvoiceNumber(String vendorInvoiceNumber) {
		this.vendorInvoiceNumber = vendorInvoiceNumber;
	}
	public String getVendorInvoiceDate() {
		return vendorInvoiceDate;
	}
	public void setVendorInvoiceDate(String vendorInvoiceDate) {
		this.vendorInvoiceDate = vendorInvoiceDate;
	}
	public String getParentCompanyCode() {
		return parentCompanyCode;
	}
	public void setParentCompanyCode(String parentCompanyCode) {
		this.parentCompanyCode = parentCompanyCode;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public PurchaseLedgerDetails getPurchaseLedgerDetails() {
		return purchaseLedgerDetails;
	}
	public void setPurchaseLedgerDetails(PurchaseLedgerDetails purchaseLedgerDetails) {
		this.purchaseLedgerDetails = purchaseLedgerDetails;
	}
	public String getShipToAddress() {
		return shipToAddress;
	}
	public void setShipToAddress(String shipToAddress) {
		this.shipToAddress = shipToAddress;
	}
	public String getShipFromAddress() {
		return shipFromAddress;
	}
	public void setShipFromAddress(String shipFromAddress) {
		this.shipFromAddress = shipFromAddress;
	}
	public double getGrossValue() {
		return grossValue;
	}
	public void setGrossValue(double grossValue) {
		this.grossValue = grossValue;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTaxPaid() {
		return taxPaid;
	}
	public void setTaxPaid(double taxPaid) {
		this.taxPaid = taxPaid;
	}
	public double getUseTax() {
		return useTax;
	}
	public void setUseTax(double useTax) {
		this.useTax = useTax;
	}
	public double getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}
	public double getNetValue() {
		return netValue;
	}
	public void setNetValue(double netValue) {
		this.netValue = netValue;
	}
	public List<TaxAnalysis> getTaxAnalysis() {
		return taxAnalysis;
	}
	public void setTaxAnalysis(List<TaxAnalysis> taxAnalysis) {
		this.taxAnalysis = taxAnalysis;
	}
	public int getDocumentCount() {
		return documentCount;
	}
	public void setDocumentCount(int documentCount) {
		this.documentCount = documentCount;
	}
	public List<Notes> getNotes() {
		return notes;
	}
	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}
	public List<CustomFields> getCustomFields() {
		return customFields;
	}
	public void setCustomFields(List<CustomFields> customFields) {
		this.customFields = customFields;
	}
	public List<Flags> getFlags() {
		return flags;
	}
	public void setFlags(List<Flags> flags) {
		this.flags = flags;
	}
	public List<GlAccounts> getGlAccounts() {
		return glAccounts;
	}
	public void setGlAccounts(List<GlAccounts> glAccounts) {
		this.glAccounts = glAccounts;
	}
	public String getToggleMode() {
		return toggleMode;
	}
	public void setToggleMode(String toggleMode) {
		this.toggleMode = toggleMode;
	}
	public boolean isHasSourceDiscrepancies() {
		return hasSourceDiscrepancies;
	}
	public void setHasSourceDiscrepancies(boolean hasSourceDiscrepancies) {
		this.hasSourceDiscrepancies = hasSourceDiscrepancies;
	}
	public boolean isNew_one() {
		return new_one;
	}
	public void setNew_one(boolean new_one) {
		this.new_one = new_one;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", created=" + created + ", updated=" + updated + ", version=" + version
				+ ", projectId=" + projectId + ", reviewStatus=" + reviewStatus + ", description=" + description
				+ ", vendorName=" + vendorName + ", vendorCode=" + vendorCode + ", vendorInvoiceNumber="
				+ vendorInvoiceNumber + ", vendorInvoiceDate=" + vendorInvoiceDate + ", parentCompanyCode="
				+ parentCompanyCode + ", companyCode=" + companyCode + ", purchaseLedgerDetails="
				+ purchaseLedgerDetails + ", shipToAddress=" + shipToAddress + ", shipFromAddress=" + shipFromAddress
				+ ", grossValue=" + grossValue + ", discount=" + discount + ", taxPaid=" + taxPaid + ", useTax="
				+ useTax + ", totalTax=" + totalTax + ", netValue=" + netValue + ", taxAnalysis=" + taxAnalysis
				+ ", documentCount=" + documentCount + ", notes=" + notes + ", customFields=" + customFields
				+ ", flags=" + flags + ", glAccounts=" + glAccounts + ", toggleMode=" + toggleMode
				+ ", hasSourceDiscrepancies=" + hasSourceDiscrepancies + ", new_one=" + new_one + "]";
	}
	
	

}
