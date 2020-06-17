package com.syntax.class01;

import java.util.Scanner;

public class PersonalPractice {
	
	public static void main(String[] args) {
		
		Scanner fetch = new Scanner(System.in);
		
		System.out.println("What is your full name");
		String name = fetch.nextLine();
		
		System.out.println("What's your age?");
		int age = fetch.nextInt();
		
		System.out.println("What is your favorite song?");
		String song = fetch.next();
		
		System.out.println("Thank you "+name+" you are "+age+" years old and your favorite song is "+song);
		
		
		
		
		
		
	}

}
