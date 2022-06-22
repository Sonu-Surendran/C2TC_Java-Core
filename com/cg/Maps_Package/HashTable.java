package com.cg.Maps_Package;

import java.util.HashMap;
import java.util.Map;

public class HashTable {
	
	public static void main(String[] args) {
		
	   Map<Integer,String> m = new HashMap<>();
	   
	   m.put(1,"Zoro");
	   m.put(2,"Law");
	   m.put(3,"Iska");
	   
	   m.put(4, "Jorgan");
	   
	   System.out.println(m);
	   
	   System.out.println(m.get(2));
	   
	   System.out.println(m.keySet());
	   
	   System.out.println(m.values());
	   
		
	}

}
