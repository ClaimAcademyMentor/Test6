package loops;

import java.util.Scanner;

public class ForLoopPrint {

	public static void main(String[] args) {
		// Write a program  that prints a number from 1 to 10
		// for loop
//		for(int i = 1; i <= 10; i++)
//		{
//			System.out.println(i);
//		}
//		System.out.println("\n Program 2");
		
		// Write a program that calculates the sum of 1 to 10.
		// for loop
		
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			sum += i; // AKA sum = sum + i;
//			System.out.println("SUM: " + sum);
//		}
		
		// Write a program that allows a user to input a positive
		// number. I want the multiplication table of that number.
		// up to 10
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = input.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num * i);
		}
	}

}
