package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap:
 * 1.it is a dynamic array
 * 	2.Automatically implement List Interface
 * 	3.Automatically shrink and grow
 * 	4.Default size is 0
 * 	5.Default value is {}
 * 	6.it has pair <K,V>
 * 	6.All has key its own hash key
 * 	7.All hash key are converted into hash code
 * 	8.All values are displayed hash code wise
 * 	9.Duplicate value are not allowed
 * 	10.put() and removed() method
 * 
 *  ArrayList : if we use duplicate data
 *  HashSet : use main in searching
 *  HasMap : if value has to be address by key
 */
public class HasMapDemo {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		
		System.out.println("Default value is :"+h1);
		System.out.println("Default size is :"+h1.size());

		
		h1.put(1, 123456);
		h1.put("Ajay", 987654464);
		h1.put("Jagtap", "Ajay");
		h1.put(2569.356f,"A");
		
		System.out.println("now value is :"+h1);
		System.out.println("now size is :"+h1.size());
		
		h1.put("Ajay", 987654464);
		System.out.println("now value is :"+h1);
		System.out.println("now size is :"+h1.size());
		
		h1.remove("Ajay");
		
		System.out.println("now value is :"+h1);
		System.out.println("now size is :"+h1.size());
		
		Set set=h1.entrySet();
		
		Iterator i1=set.iterator();
		
		while (i1.hasNext()) {
//			System.out.println(i1.next());
			//to separate key and value
			
			Map.Entry me=(Map.Entry) i1.next();
			
			System.out.println("key is :"+me.getKey());
			System.out.println("value is :"+me.getValue());
			
		}
		
	
	}
}