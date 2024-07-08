package com.collection;

import java.util.HashSet;
import java.util.Iterator;

/*
 *HashSet: 
 * 	1.it is a dynamic array
 * 	2.Automatically implement List Interface
 * 	3.Automatically shrink and grow
 * 	4.Default size is 0
 * 	5.Default value is []
 * 	6.All value has its own hash key
 * 	7.All hash key are converted into hash code
 * 	8.All values are displayed hash code wise
 * 	9.duplicate value are not allowed
 * 	10.add() and removed() method
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		
		System.out.println("Defualt value is :"+h1);
		System.out.println("Default size is :"+h1.size());
		
		h1.add(150);
		h1.add(89.89f);
		h1.add("ajay");
		h1.add("A");
		h1.add(new Integer(15));
		
		System.out.println("new value is :"+h1);
		System.out.println("new size is :"+h1.size());
		
		h1.add("ajay");
		System.out.println("new value is :"+h1);
		System.out.println("new size is :"+h1.size());
		
		h1.remove("A");
		System.out.println("new value is :"+h1);
		System.out.println("new size is :"+h1.size());

		
		h1.add("A");
		System.out.println("new value is :"+h1);
		System.out.println("new size is :"+h1.size());
		
		Iterator i1=h1.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}

}
