
// EXERCISE # 7

package com.ninja.training.assignments;

import java.util.Scanner;

public class PrintCompleteDetails {
	
	public static void main(String[] args) {
	String[] movieName = new String[8];
	int[] movieYear = new int[8];
	
	Scanner scan = new Scanner(System.in);
	
	for(int i =0; i < movieName.length; i++) {
		
		System.out.println("Enter Movie Name: ");
		String inputMovie = scan.next();
		
		movieName[i] = inputMovie;
		
		System.out.println("Enter Movie Year: ");
		int inputYear = scan.nextInt();
		
		movieYear[i] = inputYear;
	}
	
	scan.close();
	
	
	for(int i=0; i< movieName.length; i++) {
		
		System.out.println("Movie Number: " + (i+1));
		System.out.println("Movie Name: " + movieName[i]);
		System.out.println("Movie Year: " + movieYear[i]);
		
	}
  }
}
