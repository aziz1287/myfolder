package com.bl.basiccoreprograms;

import java.util.Scanner;


public class PowerOf2_prb3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		power(n);
	}

	static void power(int n) {
		if (0 <= n && n < 50) {

			int pow = 1;
			for (int i = 0; i <= n; i++) {
				System.out.println("5^" + i + " = " + pow); // ans=Math.pow(2,power)
				pow = 2 * pow; // System.out.println(power+" "+ans);
			}

		} else
			System.out.println("invalid number");

	}

}