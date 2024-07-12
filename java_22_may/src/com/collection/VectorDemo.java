package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 *  Vector :
 *  1.it is a dynamic array
 * 	2.Automatically implement List Interface
 * 	3.Automatically shrink and grow
 * 	4.Default size is 0
 * 	5.Default value is []
 *  6.Default capacity is 10
 * 	6.The sequence in which data is added and removed the same sequence it will display
 * 	7.duplicate value are allowed
 * 	8.add() and removed() method
 * 
 * 		Vector								ArrayList
 * 		Double the capacity	by 100%			Increases 50% of Capacity
 * 		Performance is low					Performance is high
 * 		synchronized						ASynchronized
 * 
 * Enumeration : only use with vector
 * when you want display the value in list instead of [] we use Enumeration
 * steps:
 * 	1.first gives all value to Enumeration object
 * 	2.use loop to traverse each object
 * 	3.to display value
 * 	
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector v1=new Vector(3,1);
		
		System.out.println("Default value is :"+v1);
		System.out.println("Default size is :"+v1.size());
		System.out.println("Default capacity is :"+v1.capacity());
		
		v1.add(12);
		v1.add(45.5f);
		v1.add("ajay");
		v1.add("ajay");
		v1.add(12);
		v1.add(45.5f);
		v1.add("ajay");
		v1.add("ajay");
		
		System.out.println("now value is :"+v1);
		System.out.println("now size is :"+v1.size());
		System.out.println("now capacity is :"+v1.capacity());
		
		v1.remove(4);
		System.out.println("now value is :"+v1);
		System.out.println("now size is :"+v1.size());
		System.out.println("now capacity is :"+v1.capacity());
		
//		Iterator i1=v1.iterator();
//		
//		while (i1.hasNext()) {
//			System.out.println(i1.next());
//		}
		
		Enumeration e1=v1.elements();
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
			
		}
		
		
	}
}