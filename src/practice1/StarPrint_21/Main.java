package practice1.StarPrint_21;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		for(int i = 1; i <= num*2; i++) {
			
			if(i % 2 == 1) {
				for(int j = 1; j <= num; j++) {
					if(j % 2 == 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					} // end if
				} // end if
			}else {
				for(int j = 1; j <= num; j++) {
					if(j % 2 == 1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					} // end if
				} // end for
			} // end if
			System.out.println();
		} // end for

	} // main
} // class
