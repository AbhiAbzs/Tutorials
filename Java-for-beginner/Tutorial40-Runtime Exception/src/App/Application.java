package App;

public class Application {
	
	public static void main(String[] args){
	/* give runtime exception error:
	 * 
	 * Exception in thread "main" java.lang.NullPointerException
	at App.Application.main(Application.java:9)
	
		String text = null;
		System.out.println(text.length());
		*/
		
		/*  give runtime exception
		 * 
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at App.Application.main(Application.java:15)
	
		String[] texts = {"one", "two", "three"};
		System.out.println(texts[3]);
		*/
		
		String[] texts = {"one", "two", "three"};
		try {
			System.out.println(texts[3]);
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		try {
			System.out.println(texts[3]);
		} catch(RuntimeException e){
			System.out.println(e.toString());
		}
		
		try {
			System.out.println(texts[3]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}
		
	}

}
