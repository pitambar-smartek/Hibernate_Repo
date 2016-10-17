package com.pitambar.exception;

import java.util.ArrayList;
import java.util.Collections;

public class DemoString {
	static long noInSeconds = 0;

	// public static final String s="prabhat";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nolist=3;
		
		ArrayList al=new ArrayList();
		al.add(45);
		al.add(25);
		al.add(68);
		al.add(14);
		al.add(77);
		Collections.sort(al);
		int l=al.size();
				
		for(int i=nolist-1;i<al.size();i++)
		{
			al.remove(i);
		}
		System.out.println(al);
	}
}