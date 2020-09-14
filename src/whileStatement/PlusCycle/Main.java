package whileStatement.PlusCycle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int cnt = 0;
		int temp = num;

		sc.close();

		while (true) {

			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			cnt++;

			if (temp == num) {
				break;
			} // end if

		} // end while
		System.out.println(cnt);
	} // main

} // class
