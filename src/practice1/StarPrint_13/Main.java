package practice1.StarPrint_13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			} // end for
			System.out.println();
		} // end for
		
		for(int i = 1; i < num; i++) {
			for(int j = 1; j <= num - i; j++) {
				System.out.print("*");
			} // end for
			System.out.println();
		} // end for
		
	} // main
} // class
