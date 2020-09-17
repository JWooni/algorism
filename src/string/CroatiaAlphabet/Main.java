package string.CroatiaAlphabet;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		sc.close();
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (int i = 0; i < arr.length; i++) {
			if (str.contains(arr[i])) {
				str = str.replaceAll(arr[i], " ");
			} // end if
		} // end for
		System.out.println(str.length());
	} // main

} // class
