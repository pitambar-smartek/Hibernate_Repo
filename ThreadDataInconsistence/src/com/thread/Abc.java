package com.thread;

public class Abc {
	String s1, s2, s3, s4;
	Abc(String s1,String s2,String s3,String s4)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
	}
	public void funA() {
		
		try {
			for(int i=0;i<20;i++)
			{
				System.out.println("hi"+s1+s2+s3+s4);
				Thread.sleep(500);
			}
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
