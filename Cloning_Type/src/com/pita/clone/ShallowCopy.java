package com.pita.clone;

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee();
		//e.setAddress("Concord Portia,Wakad,Banner");
		e.setEmpId(303);
		e.setGender("male");
		
		Address add=new Address();
		add.setHouseNo(34);
		add.setSocietyname("concord");
		
		e.setAddress(add);

		Employee eOne = (Employee) e.clone();
		

		System.out
				.println("BEFORE ANTYTHING CHANGE PRINT TWO EMPLOYEE OBJECTS");
		System.out.println(e.getAddress().getHouseNo() + "Add=" + e.getEmpId() + "empid= "
				+ e.getGender() + " gender=" + e.getName() + "Name=");

		System.out.println(eOne.getAddress().getHouseNo() + "Add=" + eOne.getEmpId()
				+ "empid= " + eOne.getGender() + " gender=" + eOne.getName()
				+ "Name=");
		
		System.out.println(e.getAddress());
		System.out.println(eOne.getAddress());
		
		

		//Address a=new Address();
		add.houseNo=90;
		//e.setAddress(a);
		System.out.println("AFTER ORIGINAL OBJECT ARE CHANGED");

		System.out.println(e.getAddress().getHouseNo() + "Add=" + e.getEmpId() + "empid= "
				+ e.getGender() + " gender=" + e.getName() + "Name=");

		System.out.println(eOne.getAddress() + "Add=" + eOne.getEmpId()
				+ "empid= " + eOne.getGender() + " gender=" + eOne.getName()
				+ "Name=");

	}

}
