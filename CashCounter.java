
package com.ArithmaticPrograms;

import java.util.Scanner;

public class CashCounter {
	public static class QNode {
		private int data;
		private QNode next;

		// Parameter and Default Constructors of QNode
		public QNode(int x) {
			this.data = x;
			this.next = null;
		}

		public QNode() {
		}
	}

	public static QNode front = null;
	public static QNode rear = null;

	// Method to push int element in the Queue using front rear
	public static void enQue(int x) {
		QNode node = new QNode(x);
		if (front == null) {
			front = node;
		} else {
			rear.next = node;
		}
		rear = node;

	}

	// Method to find size
	public void deQue() {
		if (front == null) {
			System.out.println("Queue is Underflow and Empty");
		}
		front = front.next;
	}

	public int size() {
		if (front == null) {
			System.out.println("Que is Empty Size is Zero");
			return 0;
		}
		int i = 0;
		while (front != null) {
			i++;
			front = front.next;
		}
		return i;
	}

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		CashCounter queue = new CashCounter();
		System.out.println("How many people wil stay in queue");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			CashCounter.enQue(i);
		}
		int cashierAmt = 0;
		int b = queue.size();
		while (b > 0) {
			System.out.println(
					"Please choose either of one option \n 1. Want to Deposite the Money \n 2. Want to Withdraw the Money");
			int option = sc.nextInt();
			int balance = 1000;
			switch (option) {
			case 1:
				System.out.println("Your Balance: " + balance);
				System.out.println("Enter the amount to be deposited: ");
				int amt = sc.nextInt();
				balance += amt;
				System.out.println(amt + " Amount is deposited Successfully");
				System.out.println(" ");
				System.out.println("Total Balance: " + balance);
				System.out.println(" ");
				cashierAmt += amt;
				b--;
				break;
			case 2:
				System.out.println("Enter the amount to be Withdraw: ");
				int amt1 = sc.nextInt();
				balance -= amt1;
				if (balance < 0) {
					System.out.println("Insufficent Balance");
				} else {
					cashierAmt -= amt1;
					System.out.println("Your Balance: " + balance);
					System.out.println("Amount Withdraw Successfully");
					System.out.println(" ");
					System.out.println("Total Balance: " + balance);
					System.out.println(" ");
					b--;
				}

				break;
			default:
				System.out.println("Wrong choice..");
			}
		}
		System.out.println("Cashier Balance is " + cashierAmt);
	}
}
