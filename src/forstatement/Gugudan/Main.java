package forstatement.Gugudan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		} // end for
		
	} // main

} // class

