package com.ArithmaticPrograms;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word");
		String str1 = sc.nextLine();
		Iteration(str1);
	}

	public static void Iteration(String str1) {
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str1.length(); j++) {
				char[] ch = str1.toCharArray();
				char temp;
				temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				System.out.println(ch);
			}
		}

	}

}
