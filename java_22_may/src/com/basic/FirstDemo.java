 package com.basic;

import java.text.DecimalFormat;

public class FirstDemo {
	
public static void main(String[] args) {
	int i1=2147483647; //4
	long l1=21653546454l; //8
	char ch='A'; //2
	boolean bb=true; //1 bite
	byte b1=127; //1 byte
	float f1=65.65f; //4 byte
	double d1=564331564.644445614; // 8
	
	System.out.println("Interger value is :"+i1);
	System.out.println("long value is :"+l1);
	System.out.println("char value is :"+ch);
	System.out.println("Boolean value is :"+bb);
	System.out.println("Byte value is :"+b1);
	System.out.println("float value is :"+f1);
	System.out.println("Double value is :"+d1);
	
	System.out.println();
	
	DecimalFormat dd = new DecimalFormat("#.##");
	System.out.println("Double value is :" +dd.format(d1));
	
	System.out.println();
	
	System.out.println("Size of Integer is :"+Integer.BYTES);
	System.out.println("Size of long is :"+Long.BYTES);
	System.out.println("Size of char is :"+Character.BYTES);
	System.out.println("Size of byte is :"+Byte.BYTES);
	System.out.println("Size of float is :"+Float.BYTES);
	System.out.println("Size of double is :"+Double.BYTES);	
	
}
}