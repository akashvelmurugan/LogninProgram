package com.program;
//1
import java.util.Scanner;

class HackerRank {
	static int solveMeFirst(int a, int b) {
		return a+b;
		// Hint: Type return a+b; below
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum=0;
		sum = solveMeFirst(a,b);
		System.out.println(sum);
	}



}
