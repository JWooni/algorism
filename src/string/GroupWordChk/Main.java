package string.GroupWordChk;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int cnt = Integer.valueOf(str);
		int result = cnt;
		
		for (int i = 0; i < cnt; i++) {
			String inputStr = sc.nextLine();
			int[] chk = new int[26];
			
			for (int j = 1; j < inputStr.length(); j++) {
				chk[inputStr.charAt(0) - 'a'] = 1;
				
				if (inputStr.charAt(j) != inputStr.charAt(j - 1)) {
					
					if (chk[inputStr.charAt(j) - 'a'] == 0) {
						chk[inputStr.charAt(j) - 'a'] = 1;
					} else {
						result = result - 1;
						break;
					} // end if
				} // end if
			} // end for
			chk = new int[26];
		} // end for
		System.out.println(result);
		sc.close();
	} // main
} // class
