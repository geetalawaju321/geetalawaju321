package com.from.zenhub;

import java.util.Random;

public class RandomlyPrintNameOfMonth {

	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(12);
		r = r + 1;
		if (r == 1){
			System.out.println("January");
		}else if (r == 2){
			System.out.println("Febuary");
		}else if (r ==3){
			System.out.println("March");
		}else if (r == 4){
			System.out.println("April");
		}else if (r == 5){
			System.out.println("May");
		}else if (r == 6){
			System.out.println("June");
		}else if (r == 7){
			System.out.println("July");
		}else if (r == 8){
			System.out.println("August");
		}else if (r == 9){
			System.out.println("September");
		}else if (r== 10){
			System.out.println("October");
		}else if (r == 11){
			System.out.println("November");
		}else if (r == 12){
			System.out.println("December");
		}
	}
}
