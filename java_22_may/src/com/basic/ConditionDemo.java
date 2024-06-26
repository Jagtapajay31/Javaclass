package com.basic;
/*
 * Condition:
 * if : if condition is true, true statement print else nothing
 * 
 * if else : if condition is true, true statement print else false statement print
 *  
 * nested if
 * 
 * 
 * else if ladder
 * switch
 * 
 * 
 * conditional opearator: <,>,<=,>=,==
 * 
 * 
 * a=12, b=23, c=1
 * 
 * 
 * else if ladder
 * opefrtaor logical : && || !
 * 
 * 
 */
public class ConditionDemo {
	public static void main(String[] args) {
		int a = 1000,b= 20,c=30;
	
		int a1=11;
		
		if(a1>10) {
			System.out.println("a1 is greater than 10");
		}else {
			System.out.println("a1 is smaller than 10");
		}
		
		System.out.println(" ");

		int a2=120, b1=12000, c1=1000;
		
		if(a2>b1) {
			if(a2>c1) {
				System.out.println("a is greater");
			}else {
				System.out.println("c is greater");
			}
		}else {
			if(b1>c1) {
				System.out.println("b is greater");
			}else {
				System.out.println("C is greater");
			}
		}
		
		System.out.println(" ");
		
		
		if(a>b&&a>c) {
			System.out.println("A is greater");
		}else if(b>a && b>c) {
			System.out.println("B is greater");
		}else {
			System.out.println("C is greater");
		}
	}
}