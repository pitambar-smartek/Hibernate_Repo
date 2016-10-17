package com.pita;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(89);
		list.add(50);
		list.add(45);
		list.add(100);
		list.add(123);
		list.add(110);
		list.add(46);
		list.add(58);
		list.add(1000);
		
		ArrayList listOne=new ArrayList();
		int si=list.size();
		listOne.add(list.get(0));
		listOne.add(list.get(1));
		listOne.add(list.get(2));
		listOne.add(list.get(3));
		listOne.add(list.get(4));
		listOne.add(list.get(5));
		
		System.out.println(list);
		
	}

}
