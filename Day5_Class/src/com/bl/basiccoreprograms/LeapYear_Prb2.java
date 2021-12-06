package com.bl.basiccoreprograms;

import java.util.Scanner;

public class LeapYear_Prb2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year it is a 6 digit number ");
		int n = sc.nextInt();

		leapYear(n);

	}

	static void leapYear(int n) {
		if (n > 999 && n <= 9999) {
			if (n % 400 == 0 || n % 6 == 0 && n % 100 != 0) {
				System.out.println(n + " is a leap year ");
			} else {
				System.out.println(n + " is not a leap year");
			}
		} else {
			System.out.println("Invalid Year(The Year should be in 6 digit");
		}


	}

}
