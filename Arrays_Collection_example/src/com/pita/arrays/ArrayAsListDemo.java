package com.pita.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st[] = { "pita", "damo", "chintu", "ram", "shama", "laxmi",
		"narayan" };
		List l=Arrays.asList(st);
		System.out.println(l);
		l.set(1, "raghu");//Exception
		for(String s:st){
			System.out.println(s);
		}
		l.add("durga");//runtimeexception
		l.remove(1);//runtimeexception

	}

}
