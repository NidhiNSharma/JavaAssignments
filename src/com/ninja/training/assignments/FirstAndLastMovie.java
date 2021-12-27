
// EXERCISE # 4

package com.ninja.training.assignments;

import java.util.Scanner;

public class FirstAndLastMovie {

	public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        
        int input = scan.nextInt();
        
        scan.close();
        
        if(input == 1) {
        	System.out.println("First Movie");

        }
        else if(input == 8) {
        	System.out.println("Last Movie");

        }
        else {
        	System.out.println("Not First or Last Movie");
        }
	}

}
