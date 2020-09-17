package function.sequence;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.print(hansu(num));
	} // main

	static int hansu(int num) {
		int cnt = 0;	
		for(int i = 1; i <= num; i++ ) {
			if(i < 100) {
				cnt ++;	
			} else if(i < 1000) {
				int result1 = i % 10;
				int result2 = (i / 10) % 10;
				int result3 = (i / 100) % 10;
				
				if(result1 - result2 == result2 - result3) {
					cnt ++;	
				} // end if
			} // end if
		} // end for
		return cnt;
	} // hansu 
} // class