package if_statement.quadrantPick;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		if(num1 > 0 && num2 > 0) {
			System.out.println("1");
		} else if(num1 < 0 && num2 > 0 ) {
			System.out.println("2");
		} else if(num1 < 0 && num2 < 0) {
			System.out.println("3");
		} else if(num1 > 0 && num2 < 0) {
			System.out.println("4");
		} // end if
		
	} // main

} // class
