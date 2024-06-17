package com.basic;
/*
 * Type Casting: Convert One primitive datatype to
 * primitive datatype another
 * types:
 * Implicit (Automatic) : small datatype to bigger datatype
 * int 4 to long 8
 * 
 * 
 * Explicite: Bigger datatpe to smaller datatype
 * long to int
 * 
 */

public class TypeCasting {
	public static void main(String[] args) {
	int i1=10; //4
	
	long l1=i1; //8
	
	System.out.println("Implicit conversion :"+l1);
	
	int i2=(int)l1;
	
	System.out.println("Explicite conversion :"+i2);
	
	int i3=127;
	
	byte b1=(byte) i3; //-128 -127 to 127
	
	System.out.println("Explicit int to byte :"+b1);
	
	char ch='A';
	int i4=ch;
	
	System.out.println("char to int :"+i4);	
	}
}
