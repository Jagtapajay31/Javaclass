package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Collection : to collection primitive and non primitive values into a single object
 * 
 * it contains class and interface
 * 
 * class :
 * 1.ArrayList
 * 	1.it is a dynamic array
 * 	2.Automatically implement List Interface
 * 	3.Automatically shrink and grow
 * 	4.Default size is 0
 * 	5.Default value is []
 * 	6.The sequence in which data is added and removed the same sequence it will display
 * 	7.duplicate value are allowed
 * 	8.add() and removed() method
 * 
 * 2.HashSet
 * 3.HashMap
 * 4.Vector
 * 5.Generic
 * 
 * Interface :
 * 1.List
 * 2.Set
 * 3.Map
 * 4.Iterator :
 * when you want display the value in list instead of [] we use iterator
 * steps:
 * 	1.first gives all value to iterator object
 * 	2.use loop to traverse each object
 * 	3.to display value
 * 5.Enumeration
 * 
 */
public class ArrayListDemo{
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		System.out.println("Defualt value is :"+a1);
		System.out.println("Default size is :"+a1.size());
		
		a1.add(150);
		a1.add(89.89f);
		a1.add("ajay");
		a1.add("A");
		a1.add(new Integer(150));
		
		System.out.println("new value is :"+a1);
		System.out.println("new size is :"+a1.size());
		
		a1.add("AjayJagtap");
		System.out.println("new value is :"+a1);
		System.out.println("new size is :"+a1.size());
		
		a1.remove(0);
		a1.remove("AjayJagtap");
		
		System.out.println("new value is :"+a1);
		System.out.println("new size is :"+a1.size());
		
		Iterator i1=a1.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
