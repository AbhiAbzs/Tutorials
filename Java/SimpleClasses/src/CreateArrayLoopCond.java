
public class CreateArrayLoopCond {
	public static void main(String[] args){
		
		/// simple string arrays
		String[] words;
		words = new String[3];
		words[0] = "I";
		words[1] = "love";
		words[2] = "u";
		String [] names = {"liu", "zhaoli", "xue", "aiden"};
		System.out.println(names[0]+" "+names[1]+ " and "+names[2] + " "+ names[3]);
		System.out.println("array \"words\" length is: " + words.length);
		
		/// multi-dimension arrays
		int[][] a = new int[2][2];
		a[0][0]=2;
		a[0][1]=3;
		a[1][0]=4;
		a[1][1]=5;
		if(true) {
			System.out.println("multi-D array \"a[][]\" are: " + a[0][0]+" "+a[0][1]+" "+a[1][0]+" "+a[1][1]);
		}
		
		int x = 9;
		int b = x%2;
		switch (b) {
	         case 0:
	            System.out.println("x is an even number.");
	            break;
	         case 1:
	        	 System.out.println("x is an odd number.");
		         break;
	         default: System.out.println("x is an odd number.");
		} 
		/// while skipped
		int i=0;
		do{
			System.out.println(names[i]);
			i++;
		}while(i<4);
		
		foo:
			for(int j=1; j<4; j++){
				for(int k=1; k<6; k++){
					System.out.println("j = " + j + "\t, k = " + k);
					if((j+k)>3) break foo;
				}
			}
	}
}
