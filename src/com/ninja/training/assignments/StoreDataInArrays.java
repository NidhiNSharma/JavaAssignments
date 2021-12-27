
// EXERCISE # 6

package com.ninja.training.assignments;

import java.util.Scanner;

public class StoreDataInArrays {
	public static void main(String[] args) {
		
		String[] movieName = new String[8];
		int[] movieYear = new int[8];
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter Movie Number between 1 and 8, OR 0 to EXIT: ");
			int index = scan.nextInt();
			
			if(index == 0) break;
			
			if(index < 1 || index > 8) {
				System.out.println("Invalid Input. Try again ");
				continue;
			}
			
			System.out.println("Enter Movie Name: ");
			String inputMovie = scan.next();
			
			movieName[index] = inputMovie;
			
			System.out.println("Enter Movie Year: ");
			int inputYear = scan.nextInt();
			
			movieYear[index] = inputYear;
		}
		
		scan.close();
	}

}
