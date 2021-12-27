
// EXERCISE # 3

package com.ninja.training.assignments;

import java.util.Scanner;

public class MovieByYear {
	
public static void main(String[] args) {
		
		int[] movieYear = {2001,2002,2004,2005,2007,2009,2010,2011};
		String[] movieName = {
				                "Philosopher's Stone",
				                "Chamber of Secrets",
				                "Prisoner of Azkaban",
				                "Globlet of Fire",
				                "Order of the Phoenix",
				                "Half Blood Prince",
				                "Dealthly Hallows - 1",
				                "Dealthly Hallows - 2"				             
				                };
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter any year: ");
        
        int year = scan.nextInt();
        
        scan.close();
        
        int index = -1;
		
		for(int i=0; i < movieYear.length; i++) {
			
			if(movieYear[i] == year) {
				index = i;
				break;
			}
		}
		
		if(index < 0) {
			System.out.println("No Harry Potter movie was released in that year ");
		}
		else {
			System.out.println("The Harry Potter movie released that year was: " + movieName[index]);
		}
	}
}
