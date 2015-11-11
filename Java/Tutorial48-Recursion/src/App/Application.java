package App;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 6;
		calculate(v);
		
		/// function does not change "v"
		System.out.println(v);
		
		System.out.println(factorial(5));
	}
	
	private static int calculate(int v){
		System.out.println(v);
		
		// can not call itself, will loop and give a stack (local variables) errors
		//calculate(v);
		
		// can call itself, when using if conditioner
		if(v==1) return 1;
		calculate(v-1);
		
		return calculate(v-1)*v;
	}
	
	/// factorial methods
	private static int factorial(int v){
		if(v==1) return 1;
		
		return factorial(v-1)*v;
	}

}
