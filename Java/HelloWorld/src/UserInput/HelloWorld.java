package UserInput;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a line of text:  ");
		String line = input.nextLine();
		System.out.println("You entered:  " + line);

		System.out.println("Enter a value of int:  ");
		int aint = input.nextInt();
		System.out.println("You entered:  " + aint);

		do {
			System.out.println("print something funny !");
			aint++;
		} while (aint < 5);

	}

}
