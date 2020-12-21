package com.electronic.projectElectronic.model;

public class rating extends AbstractModel{
;
	private int idOrder;
	private String createDate;
	private String content;
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public rating(int idOrder, String createDate, String content) {
		super();
		this.idOrder = idOrder;
		this.createDate = createDate;
		this.content = content;
	}
	public rating() {
		super();
	}
	
}
