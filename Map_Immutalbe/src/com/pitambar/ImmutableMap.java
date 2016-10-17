package com.pitambar;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ImmutableMap {

	
	public static final Map immutalbMap=null;
	public static void main(String[] args) {
		
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(1, "pita");
        hashMap.put(2, "damodar");
        hashMap.put(3, "krishna");
        hashMap.put(4, "ranuka");
        
       Map<Integer,String> amp=Collections.unmodifiableMap(hashMap);
       
       for(Entry<Integer, String> entry:hashMap.entrySet()){
    	   System.out.println("The Key is="+entry.getKey());
    	   System.out.println("The value is="+entry.getValue());
    	   
       }
       hashMap.put(56, "ramachandra");
       for(Entry<Integer, String> entry:amp.entrySet()){
    	   System.out.println("The Key is="+entry.getKey());
    	   System.out.println("The value is="+entry.getValue());
    	   
       }
       
	}

}
