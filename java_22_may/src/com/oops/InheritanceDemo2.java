package com.oops;
/*
 * 
 *  * 3. Hierarchical : one parent multiple child
 *  
 * 
 */
class Parent{
	String p_name;
	long ph_no;
	
	public void setParent() {
		p_name="Ajay Jagtap";
		ph_no=1234567891l;
	}
}
class child1 extends Parent{
	String name="jay";
	
	public void show() {
		System.out.println("for any complains of "+name+" "+p_name+ " call " +ph_no);
	}
}

class child2 extends Parent{
	String name="vijay";
	
	public void show() {
		System.out.println("for any complains of "+name+" "+p_name+ " call " +ph_no);
	}
}
public class InheritanceDemo2 {
	public static void main(String[] args) {
		child1 child1=new child1();
		child2 child2=new child2();
		
		child1.setParent();
		child1.show();
		
		child2.setParent();
		child2.show();
	}

}
