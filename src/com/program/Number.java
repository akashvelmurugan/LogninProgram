package com.program;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Row Count :");
		int num = scanner.nextInt();

		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = num-1; i >= 1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
