package com.electronic.projectElectronic.model;

public class cart extends AbstractModel {
	
	private int idProduct;
	private int idCustomer;
	private int amount;
	private double price;
	private double total;
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public cart(int idProduct, int idCustomer, int amount, double price, double total) {
		super();
		this.idProduct = idProduct;
		this.idCustomer = idCustomer;
		this.amount = amount;
		this.price = price;
		this.total = total;
	}
	public cart() {
		super();
	}
	
}
