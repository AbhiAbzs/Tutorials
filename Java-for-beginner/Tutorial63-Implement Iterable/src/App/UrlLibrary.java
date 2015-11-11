package App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
	private LinkedList<String> urls = new LinkedList<String>();

	private class UrlIterator implements Iterator<String>{

		private int index = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < urls.size();
		}

		
		public String next() {
			StringBuilder sb = new StringBuilder();
			
			try {
				URL url = new URL(urls.get(index));
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
				String line = null;
				
				while((line=br.readLine()) != null){
					sb.append(line);
					sb.append("\n");
				}
				br.close();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			index++;
			
			return sb.toString();
		}
		
		@Override
		public void remove() {
			// TODO Auto-generated method stub
			urls.remove(index);
		}
		
	}
	
	public UrlLibrary() {
		urls.add("http://phynp6.phy-astr.gsu.edu/~xueliang/home.html");
		urls.add("http://www.yahoo.com");
		urls.add("www.mitbbs.com");
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new UrlIterator();
	}
}
