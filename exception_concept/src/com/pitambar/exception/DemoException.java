package com.pitambar.exception;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println("after placing m1 calling");

	}
	static void m1(){
		
		try{
			System.out.println("In outer try block");
			
			
			try{
				System.out.println("In inner try block");
				System.out.println(10/0);
				
			}catch(NullPointerException e){
				System.out.println("in inner catch block");
				
			}finally{
				System.out.println("In inner finally block");
				//return ;
			}
			//System.out.println("After Inner try/catch/finally");
			
		}catch(NullPointerException e){
			System.out.println("in outer catch block");
			
		}finally{
			System.out.println("In outer finally block");
			return;
		}
		//System.out.println("After outer try/catch/finally");
		//return;
		
	}

}
