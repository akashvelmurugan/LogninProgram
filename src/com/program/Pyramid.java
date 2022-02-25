package com.program;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Row :");
		int row = scanner.nextInt();
		
		for (int i = 0; i < row; i++) {
			for (int j = i; j <row-1 ; j++) {
				System.out.print("@");
			}
			for (int j = 0; j <= i*2; j++) {
				System.out.print("%");
			}
			for (int j = i; j <row-1; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	
	}
}
