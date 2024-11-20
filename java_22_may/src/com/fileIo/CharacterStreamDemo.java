package com.fileIo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 2. Character stream
 * 		1.FileWriter
 * 			to write data into the file
 * 		2.FileReader
 * 			to read data from the file
 * 
 */
public class CharacterStreamDemo {
	public static void main(String[] args) {
		
		try {
			//to open and create file
			FileWriter fw=new FileWriter("file2.txt",true);
			String msg="\nThis is Top Tech Ahmedabad Ring Road";
			//to write into the file
			fw.write(msg);
			//3. to close file
			fw.close();
			System.out.println("data written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader fr=new FileReader("file2.txt");
			int x;
			while ((x=fr.read())!=-1) {
				System.out.print((char)x);
			}
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
