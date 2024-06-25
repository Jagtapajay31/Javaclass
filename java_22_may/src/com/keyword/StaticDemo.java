package com.keyword;
/*
 * 
 * Static : Constant at memory side
 * 
 * variable:
 * opp of Final
 * 
 * Method:
 * 
 * 
 */
class SDemo{
	int i_no;
	static int s_no;
	
}
public class StaticDemo {
	public static void main(String[] args) {
		SDemo s1=new SDemo();
		SDemo s2=new SDemo();
		SDemo s3=new SDemo();
		
		s1.i_no=1;//4 byte
		s2.i_no=2;// 4 byte
		s3.i_no=3;//4 byte
		
		System.out.println("s1 i no is  "+s1.i_no);
		System.out.println("s2 i no is  "+s2.i_no);
		System.out.println("s3 i no is  "+s3.i_no);
		
		s1.s_no=10;
		s2.s_no=20;// 4 byte
		s3.s_no=30;
		
		System.out.println("s1 s no is "+s1.s_no);
		System.out.println("s2 s no is "+s2.s_no);
		System.out.println("s3 s no is "+s3.s_no);
	}

}
