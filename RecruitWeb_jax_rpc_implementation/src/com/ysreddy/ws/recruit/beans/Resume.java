package com.ysreddy.ws.recruit.beans;

import java.io.Serializable;

public class Resume implements Serializable{
	private String title;
	private String currentCompany;
	private String address;
	private String description;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCurrentCompany() {
		return currentCompany;
	}
	public void setCurrentCompany(String currentCompany) {
		this.currentCompany = currentCompany;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
