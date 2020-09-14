package forstatement.StarPrint_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		br.close();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			} // end for
			
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			} // end for
			System.out.println();
		} // end for
		
	} // main

} // class
