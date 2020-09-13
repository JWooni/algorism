package ifstatement.AcompareB;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		if(num1 > num2) {
			System.out.println(">");
		}else if(num1 < num2){
			System.out.println("<");
		}else if(num1 == num2) {
			System.out.println("==");
		} // end if
		
	} // main

} // class
