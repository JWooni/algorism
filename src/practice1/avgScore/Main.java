package practice1.avgScore;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			
			int num = sc.nextInt();
			
			sum += num > 40 ? num : 40;
			
		} // end for
		
		sc.close();
		
		System.out.println(sum / 5);
	} // main

} // class
