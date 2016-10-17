package com.pita.arrays;

import java.util.Arrays;

public class ArraySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = { 2, 3, 87, 65, 90, 234 };
		Arrays.sort(i);
		System.out.println(Arrays.binarySearch(i, 65));
		System.out.println(Arrays.binarySearch(i, 900));
		System.out.println(Arrays.binarySearch(i, 87));
		String st[] = { "pita", "damo", "chintu", "ram", "shama", "laxmi",
		"narayan" };
		Arrays.sort(st);
		System.out.println(Arrays.binarySearch(st,"pita")+"rrr");
		System.out.println(Arrays.binarySearch(st, "naveen"));
		System.out.println(Arrays.binarySearch(st, "laxmi"));

	}

}
