package com.pita.clone;

public class Employee implements Cloneable{ 
	
	private String name;
	private Address address;
	private String gender;
	private int empId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	  @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee t=new Employee();
		
		t.address=getAddress();
		t.name=getName();
		t.empId=getEmpId();
		t.gender=getGender();
		return t;
		//return super.clone();
	}
	

}
