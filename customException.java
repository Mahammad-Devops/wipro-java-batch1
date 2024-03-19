package javaprep;

import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}
public class customException {
public static void main(String[] args) {
	System.out.println("Enter your age");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	
	try {
		if(age < 18)
			throw new InvalidAgeException("Not elgible age for vote");
		else
			System.out.println("Elgible for age");
	}
	catch(InvalidAgeException e) {
		System.out.println("Caught InvalidAgeException");
	}
}
}
