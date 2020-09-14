package forstatement.XthanSmallNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int value = 0;
		
		for(int i = 1; i <= num1; i++) {
			
			value = Integer.parseInt(st.nextToken());
			
			if(value < num2) {
				sb.append(value).append(" ");
			} // end if
			
		} // end for
		
		br.close();

		System.out.println(sb);
		
	} // main

} // class
