package com.simplilearn.uncheckedException;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Dividing two numbers");
		int num3 = num1/num2;
		
		System.out.println(num3);
		
		
	}
}
