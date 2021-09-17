package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		System.out.println("*****MOVIE LIBRARY*****");
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number of movies in your personal collection: ");
		int num = in.nextInt();

		int count = 1;
		while (count <= num) {
			if (count != 1) {
				System.out.println("You have " + count + " movies in your collection");
			} else {
				System.out.println("You have " + count + " movie in your collection");
			}
			count++;
		}
		
		

	}

}
