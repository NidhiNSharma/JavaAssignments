

// EXERCISE # 1

package com.ninja.training.assignments;

public class YearsElapsed {

	public static void main(String[] args) {
		
		int[] movieYear = {2001,2002,2004,2005,2007,2009,2010,2011};
		
		int firstMovieYear =0,lastMovieYear=0;
		
		for(int i=0; i < movieYear.length; i++) {
			if(i == 0) {
				firstMovieYear = movieYear[i];
			}
			
		    if(i == movieYear.length-1) {
		    	
		    	lastMovieYear = movieYear[i];
		    }
		}
		
		System.out.println("The years between first and last Happy Potter movie: " + (lastMovieYear-firstMovieYear));

	}
}