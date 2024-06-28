package com.cms_cls;
/*
 * Common class:
 * String : string is immutable
 * String Buffer 
 * Wrapper
 * Object
 * 
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		String  s1="This is Student";
		
		System.out.println("string value is :"+s1);
		System.out.println("string lenght is :"+s1.length());
		
		System.out.println("to upper case :"+s1.toUpperCase());
		System.out.println("to lower case :"+s1.toLowerCase());
		System.out.println("substring is :"+s1.substring(2));
		System.out.println("substring is :"+s1.substring(1, 3));
		System.out.println("char is :"+s1.charAt(6));
		
		if (s1.equalsIgnoreCase("this is Student")) {
			System.out.println("both string are same");
		} else {
			System.out.println("both string are diff");
		}
		
		System.out.println("string value is :"+s1);
		System.out.println("string lenght is :"+s1.length());
	}

}
