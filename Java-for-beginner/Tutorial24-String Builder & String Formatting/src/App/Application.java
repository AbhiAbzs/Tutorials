package App;

public class Application {

	public static void main(String[] args) {
		String info = "";
		info += "My name is Liang Xue,";
		info += " ";
		info += "I am a developer";
		System.out.println(info);
		
		StringBuilder str= new StringBuilder("");
		str.append("My name is Liang Xue,");
		str.append(" ");
		str.append("I am a developer;");
		System.out.println(str.toString());
		
		StringBuilder str1= new StringBuilder();
		str1.append("My name is Liang Xue,").append(" ").append("I am a developer;");
		System.out.println(str1.toString());

		/// formating
		System.out.print("This is some text.\tThat was a tab.\nThat was a newline");
		System.out.printf("Total cose %d, quality is: %d\n, this is %s ltd", 20, 200, "Efx");
		
	}

}
