package oneDimArray.AveragePass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();
		int stuNum = 0;
		double avg = 0;
		
		int[] arr = new int[1000];
		
		for(int i = 0; i < caseNum; i++) {
			stuNum = sc.nextInt();
			int sum = 0;
			int cnt = 0;
			
			for(int j = 0; j < stuNum; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			} // end for
			
			avg = (double)sum / stuNum;
			
			for(int j = 0; j < stuNum; j++) {
				if(arr[j] > avg) {
					cnt++;
				} // end for
			} // end for
			System.out.printf("%.3f", (double)cnt / stuNum * 100);
			System.out.println("%");
		} // end for
		sc.close();
	} // main

} // class
