package for_statement.AplusB_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int a = 0;
		int b = 0;
		
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		} // end for
		
	} // main

} // class
