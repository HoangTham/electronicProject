package com.electronic.projectElectronic.model;

public class billOrder extends AbstractModel {
	private int idCustomer;
	private String createDate;
	private double total;
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public billOrder(int idCustomer, String createDate, double total) {
		super();
		this.idCustomer = idCustomer;
		this.createDate = createDate;
		this.total = total;
	}
	public billOrder() {
		super();
	}
	
}
