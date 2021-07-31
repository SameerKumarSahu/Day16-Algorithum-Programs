package com.ArithmaticPrograms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String args[]) {
		System.out.print("Enter a string to check Palindrome:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Queue queue = new LinkedList();

		for (int i = str.length() - 1; i >= 0; i--) {
			queue.add(str.charAt(i));
		}

		String reverseString = "";

		while (!queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
		}
		if (str.equals(reverseString))
			System.out.println("The given string "+ str+" is a palindrome");
		else
			System.out.println("The given string "+ str+" isn't a palindrome");

	}
}
