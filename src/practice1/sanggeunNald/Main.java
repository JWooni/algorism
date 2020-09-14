package practice1.sanggeunNald;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int burger = 2000;
		int drink = 2000;
		int burgerprice = 0;
		int drinkprice = 0;

		if (burger >= 100 && drink >= 100) {
			for (int i = 0; i < 3; i++) {

				burgerprice = sc.nextInt();

				if (burgerprice <= burger) {
					burger = burgerprice;
				} // end if
			} // end for
			
			for(int i = 0; i < 2; i++) {
				
				drinkprice = sc.nextInt();
				
				if(drinkprice <= drink) {
					drink = drinkprice;
				} // end if
			} // end for
		} // end if
		System.out.println(burger + drink - 50);
	} // main

} // class
