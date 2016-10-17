package com.pitambar.exception;

public class MyObject {
	private int number;
	private String name;
	
	public MyObject(int num, String str){
		this.name = str;
		this.number = num;
	}
	
	public int hashCode(){
		return 1;
	}
	
	public boolean equals(Object object){
		return false;
	}
	
	public static void main(String...strings){
		MyObject myObject1 = new MyObject(1, "Amity");
		MyObject myObject2 = new MyObject(1, "Amity");
		System.out.println(myObject1);
		System.out.println(myObject2);
		System.out.println(myObject1.hashCode()+" "+myObject2.hashCode());
		System.out.println(myObject1 == myObject2);
		
		
	}
}
