package oneDimArray.NumCnt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 * num2 * num3;
		
		String str = Integer.toString(sum);
		
		sc.close();
		
		for(int i = 0; i < 10; i++) {
			int cnt = 0;
			for(int j = 0; j < str.length(); j++) {
				if((str.charAt(j) - '0') == i) {
					cnt++;
				} // end if
			} // end for
			System.out.println(cnt);
		} // end for
		
	} // main

} // class
