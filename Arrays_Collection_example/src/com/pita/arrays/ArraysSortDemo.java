package com.pita.arrays;

import java.util.Arrays;

public class ArraysSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// primitive Arrays
		int i[] = { 2, 3, 87, 65, 90, 234 };
		System.out.println("Primitive arrays before sorting");
		for (int in : i) {
			System.out.println(in);
		}
		Arrays.sort(i);
		System.out.println("Primitive arrays after sorting");
		for (int in : i) {
			System.out.println(in);
		}
		String st[] = { "pita", "damo", "chintu", "ram", "shama", "laxmi",
				"narayan" };
		System.out.println("Object arrays before sorting");
		for (String s : st) {
			System.out.println(s);
		}
		System.out.println("Object arrays after sorting");
		Arrays.sort(st);
		for (String s : st) {
			System.out.println(s);
		}
		Arrays.sort(st,new ComparatorOne());
		System.out.println("object array after sorting by using comparator");
		for(String s:st){
			System.out.println(s);
		}

	}

}
