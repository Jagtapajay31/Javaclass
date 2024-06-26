package com.basic;

/*
 * 
 * Loop: Iterative, Repetitive
 * 
 * 1.Entry control:
 * For
 * Syn:
 * For(initialization;condition;incree/decree)
 * {
 * 
 * }
 * 
 * While
 * syn:
 * initialization;
 * while(condition){
 * Statement;
 * incree/decree;
 * }
 * 
 * 2. Exit control;
 * do while
 * 
 * 
 * Syn:
 * initialization;
 * do{
 * statement
 * incree/decree
 * }while(condition);
 * 
 */
public class LoopDemo {
	public static void main(String[] args) {
		System.out.println("for loop");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		// 11 time loop is executed
		
		System.out.println("while loop");
		
		int j=1;
		while (j<=5) {
			System.out.println(j);
			j++;
		}
		// 17 time loop is executed
		
		
		System.out.println("do while");
		int k=5;
		do {
			System.out.println(k);
			k++;
		}while(k<=5);
		// 21 time loop is executed
	}
}