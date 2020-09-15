package if_statement.LeapYear;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		if(num % 4 == 0 && (num % 100 != 0 || num % 400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		} // end if
		
	} // main

} // class
