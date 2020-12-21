package com.electronic.projectElectronic.model;

public class admin extends AbstractModel{
	private int idRole;
	private String createDate;
	private String userName;
	private String passWord;
	private String fullName;
	private String address;
	private String phone;
	private String status;
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public admin(int idRole, String createDate, String userName, String passWord, String fullName, String address,
			String phone, String status) {
		super();
		this.idRole = idRole;
		this.createDate = createDate;
		this.userName = userName;
		this.passWord = passWord;
		this.fullName = fullName;
		this.address = address;
		this.phone = phone;
		this.status = status;
	}
	public admin() {
		super();
	}
	
}
