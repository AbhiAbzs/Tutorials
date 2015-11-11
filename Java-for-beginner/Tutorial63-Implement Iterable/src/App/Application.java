package App;

import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UrlLibrary urlLib = new UrlLibrary();

		/*
		for(String url: urlLib){
			System.out.println(url.length());
			System.out.println(url);
		}
		*/
		
		/// Following is same as above
		Iterator<String> it = urlLib.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value);
		}
	}

}
