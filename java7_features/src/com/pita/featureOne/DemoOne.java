package com.pita.featureOne;

public class DemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mask = 0b101010101010;
		short aShort = (short)0b1010000101000101;
		long aLong = 0b1010000101000101101000010100010110100001010001011010000101000101L;
		
		System.out.println("invalue="+mask);
		System.out.println("short value="+aShort);
		System.out.println("Long value="+aLong);  //binary literal
		
		int numeric=8989_333_35;
		System.out.println("Numberic="+numeric);//underscore iin numberic literal//int.flot,long,double
		
		
		//these are valid and allowed
		int maska = 0b1010_1010_1010;
		long big = 9_223_783_036_967_937L;
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi = 3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BFFE;
		
		
		// the below commented are Invalid underscore usages
		//float pi1 = 3_.1415F;float pi2 = 3._1415F;
		//long ssn = 999_99_9999_L;
		//int x1 = _52;int x1 = 52_;
		//int x2 = 0_x52;int x2 = 0x_52;
		
		
		
		

	}

}
