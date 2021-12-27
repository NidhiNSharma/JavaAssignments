
// EXERCISE # 8

package com.ninja.training.assignments;

import java.util.Scanner;

public class StoreFiveMovies {
	
	public static void main(String[] args) {
		String[] movieName = new String[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i =0; i < movieName.length; i++) {
			
			System.out.println("Enter Movie Name: ");
			String inputMovie = scan.next();
			
			movieName[i] = inputMovie;
			
			
		}
		
		scan.close();
		
		
		for(int i=0; i< movieName.length; i++) {
			
			System.out.println("Movie Number: " + (i+1));
			System.out.println("Movie Name: " + movieName[i]);
			
			
		}
	  }

}
