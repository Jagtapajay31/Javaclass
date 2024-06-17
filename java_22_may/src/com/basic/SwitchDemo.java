package com.basic;

public class SwitchDemo {
	public static void main(String[] args) {
		int choice = 2;
		
//		switch (choice) {
//		case 1:
//			System.out.println("Light is on");
//			break;
//		case 2:
//			System.out.println("Fan is on");
//			break;
//		case 3:
//			System.out.println("Ac is on");
//			break;			
//		default:
//			break;
//		}
		
//Vowel and consonant
		
		char ch='a';
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel!!");
			break;

		default:
			System.out.println("Consonant");
			break;
		}
		
	}
}