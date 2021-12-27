
// EXIERCISE # 5

package com.ninja.training.assignments;

import java.util.Scanner;

public class PrintMovieNameInLoop {

	public static void main(String[] args) {
	String[] movieName = { "Philosopher's Stone", 
			               "Chamber of Secrets", 
			               "Prisoner of Azkaban", 
			               "Globlet of Fire",
			               "Order of the Phoenix", 
			               "Half Blood Prince", 
			               "Dealthly Hallows - 1", 
			               "Dealthly Hallows - 2" };

	Scanner scan = new Scanner(System.in);

	while(true)
	{

		System.out.println("Enter any number between 1 and 8: ");

		int input = scan.nextInt();

		if (input >= 0 && input <= movieName.length) {

			System.out.println("Movie Name: " + movieName[input-1]);
		} else {
			System.out.println("Number out of range. Exiting...");
			break;
		}

	}

	   scan.close();
	}
}
