package App;
import java.util.Scanner;

public class Application {

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			System.out.println("Enter a value of int:  ");
			int aint = input.nextInt();
			System.out.println("You entered:  " + aint);

			do {
				System.out.println("print something funny !");
				aint++;
			} while (aint < 5);

		}
}
