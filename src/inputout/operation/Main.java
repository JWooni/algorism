package inputout.operation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * ((num2 % 100) / 10));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);
		
	} // main

} // class
