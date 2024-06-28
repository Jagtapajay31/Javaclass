package com.cms_cls;
/*
 * Wrapper class : conversion of primitive data type to non primitive and vice a versa
 * 
 * primitive			Wrapper class			Wrapper class
 * integer				Integer					Integer.parseInt()
 * float				Float					Float.parseFloat()
 * char					Character				Character.parsechar()
 * byte					Byte					Byte.parseByte()
 * short				Short					Short.parseShort()
 * long					Long					Long
 * double				Double					Double
 * boolean				Boolean					Boolean
 * 
 * 1. Auto boxing : value given to the object
 * 2. Boxing : value first given to the variable  to object
 * 3. Un boxing : object to variable
 * 
 * object : it is a root class for all java class
 * 
 * 
 */
class First{
	public void show() {
		System.out.println("this is first class");
	}
}
public class WrapperClassDemo {
	public static void main(String[] args) {
		String s1=new String("This is Student");
		
		System.out.println("auto boxing is :"+s1);
		
		
		int i1=10;
		
		Integer i2=new Integer(i1);
		
		System.out.println("Boxing is :"+i2);
		int i3=i2;
		
		
		System.out.println("Un boxing is :"+i3);
		
		String str1="123";
		String str2="10";
		
		StringBuffer s3=new StringBuffer(str1);
		
		System.out.println("sum is :"+(str1+str2));
		
		int i4=Integer.parseInt(str1);
		int i5=Integer.parseInt(str2);
		
		System.out.println("Sum is :"+(i4+i5));
		
		int i6=10;
		String s7=String.valueOf(i6);
		
		System.out.println(s7);
		
		First f1=new First();
		f1.show();
		
		
		
	}

}
