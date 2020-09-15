package oneDimArray.MaxValue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		int max = 0;
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] > max) {
				max = arr[i];
				cnt = i+1;
			} // end if
		} // end for
		sc.close();
		System.out.println(max);
		System.out.println(cnt);
	} // main

} // class
