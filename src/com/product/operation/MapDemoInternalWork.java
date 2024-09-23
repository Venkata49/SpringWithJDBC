package com.product.operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemoInternalWork {

	public static void main(String[] args) {

//		List Interface super class Collection....
		
		List<String> str= new ArrayList<>();
		str.add("hello");
		str.add("world");
		str.add("Java");
		
		System.out.println("List Operations : "+str);
		/*
		 * Map is an Interface and it's sub class is HashMap()..
		 * Map contain -- Map<K, V> (key, value) pair is called one entity..
		 * Map dosen't allow duplicate Keys and it allows duplicate Values
		 *  
		 */
		
		
//		Map Interface...
		
		Map<Integer, String> ty = new HashMap<>();
		ty.put(1, "hello");
		ty.put(1, "java");
		ty.put(2, "hello");
		
		System.out.println("Map Operations : "+ty);
		
		Map<Integer, String> ty1 = new HashMap<>();
		ty1.put(1, "hello");
		ty1.put(1, "java");
		ty1.put(2, "hello");
		
		System.out.println("Map Operations : "+ty1);
		
		Map<Integer, String> ty2 = new HashMap<>();
		ty2.put(1, "hello");
		ty2.put(3, "java");
		ty2.put(2, "hello");
		
		System.out.println("Map Operations : "+ty2);
		
		List<Object> lm = new ArrayList<>();
		lm.add(ty);
		lm.add(ty1);
		lm.add(ty2);
		
		System.out.println(lm);

		
		
	}
}
