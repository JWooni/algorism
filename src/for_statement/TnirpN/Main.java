package for_statement.TnirpN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		br.close();
		
		for(int i = num; i >= 1; i--) {
			System.out.println(i);
		} // end for
		
	} // main

} // class
