package string.StringRepeat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		for(int i = 0; i < num; i++) {
			int cnt = sc.nextInt();
			String str = sc.nextLine();
			
			String result = "";
			
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < cnt; k++) {
					result += str.charAt(j);
				} // end for
			} // end for
			result = result.replace(" ", "");
			System.out.println(result);
		} // end for
		sc.close();
	} // main

} // class
