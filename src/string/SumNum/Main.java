package string.SumNum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		String str = sc.next();

		sc.close();

		for (int i = 0; i < num; i++) {
			sum += str.charAt(i)-'0';
		} // end for
		
		System.out.println(sum);
	
	} // main

} // class
