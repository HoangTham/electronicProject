package com.electronic.projectElectronic.model;

public class categories extends AbstractModel{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public categories(String name) {
		super();
		this.name = name;
	}

	public categories() {
		super();
	}
	
}
