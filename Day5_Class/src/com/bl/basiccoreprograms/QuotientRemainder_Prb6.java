package com.bl.basiccoreprograms;

import java.util.Scanner;

public class QuotientRemainder_Prb6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dividend number: ");
		int num1 = sc.nextInt(); 
		System.out.println("Enter the Divison number: ");
		int num2 = sc.nextInt(); 
		findQuotientRemainder(num1, num2);
	}

	static void findQuotientRemainder(int num1, int num2) {
		int quotient = num1 / num2;
		int remainder = num1 % num2;

		System.out.println("some " + num1 + " and divisor " + num2 + " is " + quotient);
		System.out.println("some " + num1 + " and divisor " + num2 + " is" + remainder);

	}

}
