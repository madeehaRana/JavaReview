package com.syntax.class01;

import java.util.Scanner;

public class VariableValues {
	public static void main(String[] args) {
		
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Do you need a loan?");
			boolean needLoan = scanner.nextBoolean();
			
			if (!needLoan) {
				System.out.println("Good bye!");
			} else {
				System.out.println("What is your credit score?");
				int score = scanner.nextInt();
				if (score < 600) {
					System.out.println("The eligibility is " + "Not eligible");
				} else if (score >= 600 && score <= 700) {
					System.out.println("The eligibility is " + "Maybe eligible");
				} else if (score >= 701 && score <= 800) {
					System.out.println("The eligibility is " + "Eligible");
				} else {
					System.out.println("The eligibility is " + "Definitely eligible");
				}
			}
		}
	











		
	    
		
	}
	


