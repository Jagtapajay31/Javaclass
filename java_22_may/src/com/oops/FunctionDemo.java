package com.oops;
/*
 * 
 *  Function : does something
 *  1. function without parameter without return type
 *  2. function with parameter without return type
 *  3. function without parameter with return type
 *  4. function with parameter with return type
 *  
 *  
 *  polymorphism : one name multiple form
 *  
 *  1. Function overloading
 *  same function name but different parameter
 *  2. Function overriding
 */

//1. function without parameter without return type
class calc{
	int a,b,c,a1,b1;
	
	public void sum() {
		a=20;
		b=5;
	}
	
//2.function with parameter without return type
	public void sum(int num1, int num2) {
		a=num1;
		b=num2;
	}
	public void sum(float num1,float num2) {
		a1=(int) num1;
		b1=(int) num2;
		System.out.println("sum is :"+(a1+b1));
	}
	
	
//3. function without parameter with return type
	public int mul() {
		a=25;
		b=5;
		return (a*b);
	}
	
//4. function with parameter with return type
	public int mul(int a,int b) {
		
		return (a*b);
	}
	
	public void show() {
		System.out.println("sum is :"+(a+b));
	}
}

public class FunctionDemo {
	public static void main(String[] args) {
		calc c1=new calc();
		
		c1.sum();
		c1.show();
		c1.sum(10,5);
		c1.show();
		c1.sum(25.50f,25.50f);
		
		System.out.println("multiplication is :"+c1.mul());

		System.out.println("multiplication is :"+c1.mul(15,2));

//		System.out.println("multiplication is :"+c1.mul(1,2,3));
		
		
	}

}
