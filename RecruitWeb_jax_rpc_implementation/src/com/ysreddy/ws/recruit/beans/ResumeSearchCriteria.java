package com.ysreddy.ws.recruit.beans;

import java.io.Serializable;

public class ResumeSearchCriteria implements Serializable{
	private int yearOfExperience;
	private String technology;
	private double currentCTC;
	private double expectedCTC;
	private boolean certified;
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public double getCurrentCTC() {
		return currentCTC;
	}
	public void setCurrentCTC(double currentCTC) {
		this.currentCTC = currentCTC;
	}
	public double getExpectedCTC() {
		return expectedCTC;
	}
	public void setExpectedCTC(double expectedCTC) {
		this.expectedCTC = expectedCTC;
	}
	public boolean isCertified() {
		return certified;
	}
	public void setCertified(boolean certified) {
		this.certified = certified;
	}
	

}
