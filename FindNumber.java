package com.ArithmaticPrograms;

import java.util.Scanner;

public class FindNumber {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter your Up and Low limit");
		System.out.println("Enter Low Num");
		int low = sc.nextInt();
		System.out.println("Enter High Num");
		int high = sc.nextInt();
		System.out.println("Think of a number n between " + low + " to " + high);

		while (low < high) {
			int mid = (low + high) / 2;
			System.out.println("1: Your Num is less-than " + mid);
			System.out.println("2: Your Num is greater-than " + mid);
			System.out.println("3: Your Num is equal to " + mid);
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				high = mid;
			case 2:
				low = mid;
			case 3:
				System.out.println("Your azume Num is " + mid);
				break;
			}
		}

	}

}
