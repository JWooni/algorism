package for_statement.Plus;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		} // end for
		System.out.println(sum);
	} // main

} // class
