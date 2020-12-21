package com.electronic.projectElectronic.model;

public class role extends AbstractModel{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public role(String name) {
		super();
		this.name = name;
	}

	public role() {
		super();
	}
	
}
