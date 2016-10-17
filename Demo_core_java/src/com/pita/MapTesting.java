package com.pita;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class MapTesting {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Hashtable table=new Hashtable();
		//table.put(null, "ramiya"); //HashTable does not allowed null as key and null as value.
		table.put("pita","pita");
		/*System.out.println(table+" is the table");
		table.put(null, "rinku");*/  // HashTable allows only one null
		//table.put(null,"radha");
		System.out.println("The HashTable="+table);
		
		LinkedHashMap map=new LinkedHashMap();
		map.put("pita", "ramesh");//hashMap and linkedhashmap allows null as key and value.
		                          ///replace the old null if you add null more than once and you can add multiple as value.
		map.put(null, null);
		map.put(null,"ram");
		System.out.println(map);
		TreeMap treeMap=new TreeMap();//allowd only one null is treemap having no element otherwise throws NullPointerException
		treeMap.put("rama","dama");    //multiple null allowed as value in case of treeMap class
		//treeMap.put(null, "rama");
		treeMap.put("tinguru", null);
		treeMap.put("r", null);
		System.out.println(treeMap+"Tree map is here");
		
		WeakHashMap wmap=new WeakHashMap();
		wmap.put("r","s");
		wmap.put(null, "ramalila");  //it allowd null as key and value and if put multiple null as key then it replace the latesh one.
		wmap.put(null,"r");
		System.out.println("WEAK Map="+wmap);
		
		ConcurrentSkipListSet set=new ConcurrentSkipListSet();
		//set.add(null);
		set.add("rama");
		set.add("sita");
		set.add("ankita");
		set.add("pintu");
		System.out.println("The Set is="+set);
		
	}

}
