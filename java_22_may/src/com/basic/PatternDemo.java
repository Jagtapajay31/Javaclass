	package com.basic;
/*
 * for i
 * initialization
 * first no of pattern
 * 
 * Condition
 * largest to smallest no in pattern
 * 
 * Smallest to largest <=
 * largest to smallest >=
 * 
 * Incree/Decree
 * <=  ++
 * >=  --
 * 
 * 
 * for j
 * initialization
 * first col each row
 * same no : that no only
 * Diff no : upper loop name
 * 
 * 
 * Condition
 * check each row
 *
 * Smallest to largest <=
 * largest to smallest >=
 * 
 * incree/Decree
 * <=  ++
 * >=  --
 * 
 * for k:
 * 1. k completely depends on i
 * 
 * 
 */

import java.util.Iterator;

public class PatternDemo {
	public static void main(String[] args) {
/*
*  123456 
*  123456 
*  123456 
*  123456 
*  123456 
*/		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345		
 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

/*
 * 5
 * 45
 * 345
 * 2345
 * 12345		
 */
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j<= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

/*
 * 5
 * 54
 * 543
 * 5432
 * 54321		
 */
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

/*
 * 1
 * 21
 * 321
 * 4321
 * 54321		
 */
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

/*
 * 1
 * 10
 * 101
 * 1010
 * 10101		
 */
		 for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= i; j++) {
	                    System.out.print(j%2);
	                }
	            System.out.println();
	        }
			System.out.println();

/*
 * 1
 * 12
 * 123
 * 1234
 * 12345		 
 */
		for (int i = 65; i <=69; i++) {
			for (int j = 65; j <=i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		System.out.println();

/*
 * a
 * ab
 * abc
 * abcd
 * abcde
 */
		for (int i = 97; i <=101; i++) {
			for (int j = 97; j <=i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		System.out.println();

/*
 *     1 
 *    12 
 *   123 
 * 	1234 	
 * 12345	
 */
		for (int i = 1; i <= 5; i++) {
			for (int k = i; k <= 5; k++) {
				System.out.print(" ");
			}
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
/*
 *			1
 *		   1 2
 *		  1 2 3
 *       1 2 3 4
 *      1 2 3 4 5 		 		
 */
		for (int i = 1; i <= 5; i++) {
			for (int k = i; k <= 5; k++) {
				System.out.print(" ");
			}
				for (int j = 1; j <= i; j++) {
					System.out.print(" "+j);
				}
				System.out.println();
			}
/*
 * 
 */
		
		}
		
	}