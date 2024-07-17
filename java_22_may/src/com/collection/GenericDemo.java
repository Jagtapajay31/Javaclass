package com.collection;

import java.util.ArrayList;

/*
 * Generic : to generalize the Collection into a specific type
 * 
 * ArrayList<Integer>
 * it will only take integer type of data
 * 
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(15);
		a1.add(new Integer(25));
		
		System.out.println("new value is :"+a1);
		System.out.println("new size is :"+a1.size());
	}
}