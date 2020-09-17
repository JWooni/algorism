package oneDimArray.average;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double[] arr = new double[num];
		double max = 0;
		double sum = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			 arr[i] = sc.nextDouble();
		} // end for
		
		sc.close();
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} // end if
		} // end for
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max * 100;
			sum += arr[i];
		} // end for
		
		avg = sum / num;
		
		System.out.printf("%.2f", avg);
		
	} // main
} // class
