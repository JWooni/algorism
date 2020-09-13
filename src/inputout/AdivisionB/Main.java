package inputout.AdivisionB;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double result = num1 / num2;
		sc.close();
		System.out.println(result);
		
	} // main

} // class
