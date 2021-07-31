
package com.ArithmaticPrograms;

import java.util.Scanner;

public class BalancedParen {
	static int j = 0;

	public static class Node {
		private char data;
		private Node next;

		// Parameter Constructor
		public Node(char ch) {
			this.data = ch;
			this.next = null;
		}
	}

	// Represent the 'Stack Pointer'
	private Node top = null;

	/// Method to push element in the stack
	public void push(char ch) {
		Node node = new Node(ch);
		if (top == null) {
			top = node;
		} else {
			node.next = top;
			top = node;
		}
	}

	// Method to display the stack Pop value
	public int pop() {
		if (top == null) {
		} else {
			return top.data;
		}
		return 0;
	}

	private boolean isEmpty() {
		if (j == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Experssion ");
		String expersion = sc.nextLine();// ("(((5+6)*(7+8)/(4+3)(5+6)*(7+8)/((4+3))))");

		BalancedParen stack = new BalancedParen();

		for (int i = 0; i < expersion.length(); i++) {
			// boolean isBalanced = false;
			char ch = expersion.charAt(i);
			if (ch == '(') {
				j++;
				stack.push(ch);
			} else if (ch == ')') {
				stack.pop();
				j--;
			}
		}
		if (stack.isEmpty()) {
			System.out.println("Expression has balanced parenthesis");
		} else {
			System.out.println("Expression has not balanced parenthesis");
		}

	}

}
