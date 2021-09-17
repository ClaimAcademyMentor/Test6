package loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		System.out.println("*****MOVIE LIBRARY*****");
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number of movies in your personal collection: ");
		int num = in.nextInt();
		System.out.println("\n**********FOR LOOP*************\n");
		for (int i = 1; i <= num; i++) {
			if (i == 1) {
				System.out.println("You have " + i + " movie in your collection");

			} else {
				System.out.println("You have " + i + " movies in your collection");
			}
		}
		
		
	}

}
