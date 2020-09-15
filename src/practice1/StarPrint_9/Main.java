package practice1.StarPrint_9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			} // end for
			for (int k = i; k <= (num * 2) - i; k++) {
				System.out.print("*");
			} // end for
			System.out.println();
		} // end for

		for (int i = 1; i <= num - 1; i++) {
			for (int j = num - 1; j > i; j--) {
				System.out.print(" ");
			} // end for
			for (int k = 1; k <= (i * 2) + 1; k++) {
				System.out.print("*");
			} // end for
			System.out.println();
		} // end for

	} // main
} // class
