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
	
		/*int a=11;
		
		if(a>10) {
			System.out.println("a is greater than 10");
		}else {
			System.out.println("a is smaller than 10");
		}
		}*/
//		int a=120, b=12000, c=1000;
//		
//		if(a>b) {
//			if(a>c) {
//				System.out.println("a is greater");
//			}else {
//				System.out.println("c is greater");
//			}
//		}else {
//			if(b>c) {
//				System.out.println("b is greater");
//			}else {
//				System.out.println("C is greater");
//			}
//		}
//	}	
		if(a>b&&a>c) {
			System.out.println("A is greater");
		}else if(b>a && b>c) {
			System.out.println("B is greater");
		}else {
			System.out.println("C is greater");
		}
	}
}