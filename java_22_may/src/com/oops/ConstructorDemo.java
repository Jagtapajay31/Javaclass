package com.oops;
/*
 * Constructor: it is a special member function
 * which is initialized automatically
 * 1. same name is class name
 * 2. it has no return type
 * 3. it is automatically invoked whenever the object is created
 * 
 * types:
 * 1. Default constructor(without parameter)
 * 2. parameterized constructor(with parameter)
 * 3. copy constructor(object as a parameter)
 * 
 */

class VolumeofBox{
	double lenght,width,height;
	//Default constructor
	public VolumeofBox() {
		System.out.println("In Defualt constructor");
		lenght=1.5;
		width=22.5;
		height=3.3;
	}
	public VolumeofBox(double l,double w,double h) {
		System.out.println("In parameter constructor");
		lenght=l;
		width=w;
		height=h;
	}
	public VolumeofBox(VolumeofBox vob) {
		System.out.println("In copy constructor");
		lenght=vob.lenght;
		width=vob.width;
		height=vob.height;
	}
	
	public void volume() {
		System.out.println("Volume of Box is :"+(lenght*width*height));
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		VolumeofBox dc=new VolumeofBox();
		dc.volume();
		
		VolumeofBox pc=new VolumeofBox(10,20,30);
		pc.volume();
		
		VolumeofBox cc=new VolumeofBox(dc);
		cc.volume();
	}
}