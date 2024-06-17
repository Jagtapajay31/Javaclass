package com.oops;
/*
 * OOP: Object oriented programming
 * 1. to organize the code
 * 2. to create less object
 * 3. reduce code redundancy
 * 
 *  
 *  concept of oops
 *  1.class
 *  2.object
 *  3.Encapsulation
 *  4.Inheritance
 *  5.Polymorphism
 *  6.Abstraction
 *  
 *  class: it is a collection of data member and member function
 *  
 *  Object: Object gives the permission to access functionslity of class
 *   
 *  Encapsulation: Wrapping of data
 *  Access specifier
 *  1.private : only access within a class 
 *  2.protected : only access given to the child
 *  3.default : only accessible within a package
 *  4.Public : accessible everywhere
 *  
 */
class Student{
	
	private int roll_no;
	String name;
	
	public void setData() {
		roll_no = 1;
		name = "Ajay";
	}
	
	public void display() {
		System.out.println("roll no is :"+roll_no);
		System.out.println("name is :"+name);		
	}
}
public class ClassDemo {
	public static void main(String[] args) {
	//class_name obj_name =new class_name();
		Student s1=new Student();
		s1.setData();
		s1.display();
		
		System.out.println("roll no is :");
		System.out.println("name no is :"+s1.name);
		
	}
}
