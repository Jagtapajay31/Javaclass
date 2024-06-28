package com.cms_cls;
/*
 * String Buffer : Mutable
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("This is Car");
		
		System.out.println("original string value is :"+s1);
		System.out.println("original string lenght is :"+s1.length());
		
		s1.insert(0,"Hello");
		System.out.println("now string value is :"+s1);
		System.out.println("now string lenght is :"+s1.length());
		
		s1.append("Bye");
		System.out.println("original string value is :"+s1);
		System.out.println("original string lenght is :"+s1.length());
		
		s1.delete(1, 3);
		System.out.println("now string value is :"+s1);
		System.out.println("now string lenght is :"+s1.length());
		
		s1.replace(1, 4, "what");
		System.out.println("now string value is :"+s1);
		System.out.println("now string lenght is :"+s1.length());
		
		s1.reverse();
		System.out.println("now string value is :"+s1);
		System.out.println("now string lenght is :"+s1.length());
	}

}
