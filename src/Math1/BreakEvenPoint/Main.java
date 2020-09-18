package Math1.BreakEvenPoint;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		long staticCost = sc.nextInt();
		long variableCost = sc.nextInt();
		long price = sc.nextInt();
		long result = 0;
		
		sc.close();
		
		if(price <= variableCost) {
			result = -1;
		} else {
			result = (staticCost / (price - variableCost)) + 1;
		} // end if
		System.out.println(result);
	} // main

} // class
