package com.fileIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * File:
 * it is class
 * if we want to store the data permanent we use file
 * we use stream to store data permanent
 * stream : it is medium to store data
 * if source has the data destination will have too
 * 
 * 1. Byte stream : 1 byte/char
 * 		1.FileOutputStream
 * 		to write data into the file
 * 		2.FileInputStream
 * 		to read data from the file
 * 2. Character stream
 * 		1.FileWriter
 * 			to write data into the file
 * 		2.FileReader
 * 			to read data from the file
 * 
 * steps:
 * 1.to open a file into particular class
 * 2.write/read into/from the file
 * 3.to close file
 * 
 * must have error
 * IOException
 * FileNotFoundException
 * 
 */
public class ByteStreamDemo {
	public static void main(String[] args) {
		
		try {
			//to open and create file
			FileOutputStream fos=new FileOutputStream("file1.txt",true);
			String msg="\nThis is tops technologies...surat";
			byte[] bb=msg.getBytes();
			//to write into the file
			fos.write(bb);
			//3.to close file
			fos.close();
			System.out.println("data write");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis=new FileInputStream("file1.txt");
			int x;
			while ((x=fis.read())!=-1) {
				System.out.print((char)x);
			}
			//3.to close file
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
