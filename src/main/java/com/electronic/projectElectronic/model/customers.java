package com.electronic.projectElectronic.model;

public class customers {
	private String userName;
	private String passWord;
	private String fullName;
	private String address;
	private String phone;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public customers(String userName, String passWord, String fullName, String address, String phone, String status) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.fullName = fullName;
		this.address = address;
		this.phone = phone;
		
	}
	public customers() {
		super();
	}
	
}
