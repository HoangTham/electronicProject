package com.electronic.projectElectronic.model;

public class products extends AbstractModel{
	private String name;
	private int idSupplier;
	private int idCategory;
	private String description;
	private String image;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdSupplier() {
		return idSupplier;
	}
	public void setIdSupplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public products(String name, int idSupplier, int idCategory, String description, String image, double price) {
		super();
		this.name = name;
		this.idSupplier = idSupplier;
		this.idCategory = idCategory;
		this.description = description;
		this.image = image;
		this.price = price;
	}
	public products() {
		super();
	}
	
}
