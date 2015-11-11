package App;
import java.util.Scanner;


public class Application {

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			System.out.println("Enter a line of text:  ");
			String line = input.nextLine();
			System.out.println("You entered:  " + line);

			switch (line) {
			case "start":
				System.out.println("Computer start.");
				break;
				
			case "stop":
				System.out.println("Computer stop.");
				break;
				
			default:
				System.out.println("Command not found.");

			}
		}
}