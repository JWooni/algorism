package string.WordCnt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().split(" ");
		int cnt = str.length;
		sc.close();
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("")) {
				cnt--;
			} // end if

		} // end for
		System.out.println(cnt);
	} // main

} // class
