package string.WordStudy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().toUpperCase();
		
		int[] arr = new int[26];
		
		int max = 0;
		int result = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int alpha = str.charAt(i);
			arr[alpha-65]++;
		} // end for
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				result = i + 65;
			} else if(max == arr[i]) {
				result = '?';
			} // end if
		} // end for
		System.out.println((char)result);
		sc.close();
	} // main

} // class
