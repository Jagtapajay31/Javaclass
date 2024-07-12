package com.oops;
/*
 * Inheritance : making a class with the help of another class
 * deriving the attribute of some other class
 * 
 * Re usability
 * Extensibility
 * less object creation
 * use "extends" keyword to inherit the parent class
 * 
 * types:
 * 1. Single : one parent one child
 * 2. Multilevel : one grandparent one parent one child
 * 3. Hierarchical : one parent multiple child
 * 4. multiple : multiple parent single child(not directly supported in java)
 * 5. hybrid : combination any two
 * 
 * object will be created for last only
 * 
 */

class student12
{
	protected int id;
	protected String name;
	
	public void setData() 
	{
		id=1;
		name="ajay";
	}
}
	class Sports extends student12
	{
		int sport_marks=85;
//		System.out.println(""+id);
	}
	class Result extends Sports
	{
		String grade="A+";
		
		public void show() 
		{
			System.out.println("id is :"+id);
			System.out.println("name is :"+name);
			System.out.println("sport marks :"+sport_marks);
			System.out.println("result is :"+grade);
		}
	}
public class InheritanceDemo {
	public static void main(String[] args) {
		Result rs=new Result();
		rs.setData();
		rs.show();
	}
}