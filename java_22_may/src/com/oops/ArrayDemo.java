package com.oops;

import java.util.Arrays; 
import java.util.Scanner; 

/*
 * Array : collection of data of similar type
 * 1. start with index 0
 * 2. size=length - 1
 * 3. if data enter is greater than size
 * it will give exception ArrayIndexOutofBound()
 * 
 * 
 * type :
 * 1 D Array
 * 2 D Array
 * Jagged/ragged Array 
 * 
 * new 
 * 
 * 
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// syn: datatype[] [variable_name]=new datatype[size];
		
//		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=i+1;
//			System.out.println(a[i]);
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
			
		// 23 4 67 2 5
		// Bubble short
		// selection sort
		
		Scanner sc=new Scanner(System.in);	
		int[] num=new int[5];
		System.out.println("enter the value :");

		for (int i = 0; i < a.length; i++) {
			num[i]=sc.nextInt();
	
		}
//		for (int i = 0; i < num.length; i++) {
//			for (int j = i+1; j < num.length; j++) {
//				if(num[i]>num[j]) {
//				
//				int temp=num[i];//23
//				num[i]=num[j];//4
//				num[j]=temp;//23
//				}
//			}
//		}
		Arrays.sort(num);
		System.out.println("Sorted Array");
		for (int i = 0; i < num.length; i++) {
			
			System.out.println(num[i]);
			
		}

		}
	}
}