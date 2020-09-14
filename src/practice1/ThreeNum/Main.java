package practice1.ThreeNum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		} // end for
		
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} // end if
			} // end for
		} // end for
		System.out.println(arr[1]);
	} // main

} // class
