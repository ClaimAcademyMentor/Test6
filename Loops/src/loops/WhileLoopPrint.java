package loops;

import java.util.Scanner;

public class WhileLoopPrint {

	public static void main(String[] args) {
		// Write a program that allows a user to input a positive
		// number. I want the multiplication table of that number.
		// up to 10
//		

		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a positive number: ");
//		int num = input.nextInt();
//		//int i = 1; i <= 10; i++
//		
//		int i = 1;
//		
//		while(i <= 10) {
//			System.out.println(num * i);
//			i++;
//		}

		// Write a program that allows a user to input a number
		// and it outputs the number in reverse order.
		// input 12345 the output is 54321

		System.out.println("Enter a series of numbers (ex: 12345): ");
		int num2 = input.nextInt();

		// Declare two variables: one to place the last digit into
		// and one to perform the function.
		int reverse = 0;
		int remainder = 0;

		while (num2 > 0) {
			remainder = num2 % 10;
			// isolate the last digit
			System.out.println(remainder);
			// place last digit into a new variable
			reverse = reverse * 10 + remainder;
			System.out.println(reverse);
			// remove the last digit from the original variable
			num2 = num2 / 10;
			System.out.println(num2);
		}
		System.out.println("Reverse of " + num2 + " is " + reverse);
	}

}
