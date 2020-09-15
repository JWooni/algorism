package if_statement.AlarmsClocks;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		sc.close();
		
		if(minute < 45) {
			hour--;
			minute = 60 - (45 - minute);
			if(hour < 0) {
				hour = 23;
			} // end if
			System.out.println(hour + " " + minute);
		} else {
			System.out.println(hour + " " + (minute - 45));
		}
	} // main

} // class
