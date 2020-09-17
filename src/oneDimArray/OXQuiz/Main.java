package oneDimArray.OXQuiz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextLine();
		} // end for

		sc.close();
		
		for(int i = 0; i < arr.length; i++) {
			int cnt = 0;
			int sum = 0;
			
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				}else {
					cnt = 0;
				} // end if
				sum += cnt;
			} // end for
			System.out.println(sum);
		} // end for
		
	} // main
} // class