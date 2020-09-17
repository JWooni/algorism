package string.AlphabetSearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		sc.close();
		
		for(char chr = 'a'; chr <= 'z'; chr++) {
			System.out.print(str.indexOf(chr)+" ");
		} // end for
		
	} // main

} // class
