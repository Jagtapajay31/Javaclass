package com.oops;

import java.util.Scanner;

/*
 * Scanner :
 * it is a class
 * derived from java util package
 * main purpose is to take input from the  user
 * use system.in as a parameter
 * 
 * data type   							Scanner class function
 * int 									nextInt()
 * float								nextFloat()
 * long									nextLong()
 * boolean								nextBoolean()
 * double								nextDouble()
 * char									next().charAt(0);
 * 
 * Class
 * String
 * word									next()
 * stop reading when space key is pressed
 * 
 * line									nextLine()
 * stop reading when enter key is pressed								
 * 
 * 
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		
		System.out.println("sum is :"+(a+b));
		
		char ch;
		
		System.out.println("Enter a character: ");
		ch=sc.next().charAt(0);
		
		System.out.println("char is :"+ch);
		
//		String name:
		
//		System.out.println("enter your name :");
//		name=sc.next();
//		
//		System.out.println("name is :" +name);
//		
//		sc.nextLine();//buffer clean
		String name12;
		
		System.out.println("Enter full name :");
		name12=sc1.nextLine();
		System.out.println("full name is :" +name12);
		
	}
}
