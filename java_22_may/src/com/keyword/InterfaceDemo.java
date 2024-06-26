package com.keyword;
/*
 * Interface:
 * 1. same as class but we cannot create object of Interface
 * 2. all data member are final by default
 * 3. all member functions are abstract by default
 * 4. interface contains only data member and member function
 * 5. main purpose is to solve the problem of multiple interface
 * 6. use "implement" keyword to  inherit interface
 * 7. pure data hiding
 *  
 */

class Result{
	String grade="A+"; 
}
class InterDemo extends Result implements IDemo{
	
	@Override
	public void show() {
		System.out.println("i no is :"+i_no);
		System.out.println("grade is :"+grade);
		System.out.println("i 2 is :"+i2);
		
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		InterDemo id=new InterDemo();
		id.show();
	}

}
