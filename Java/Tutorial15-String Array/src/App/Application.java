package App;

public class Application {

	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
						
		String[] fruit = {"apple", "banana", "pear", "organe"};
		
		for(int i=0; i<fruit.length; i++){
			System.out.println(fruit[i] + "\t" + a[i]);
		}
		
		int[][] grid = {
				{10, 9, 8},
				{7,  6},
				{4,  3, 2},
				{1000, 3203, 300, 50, 666}
		};
		
		System.out.println(grid.length);
		System.out.println(grid[3].length);
		
		System.out.println(grid[0][1]);
		System.out.println(grid[1][1]);
		System.out.println(grid[2][2]);
		System.out.println(grid[3][4]);
		
		for(int row=0; row<grid.length; row++){
			for(int col=0; col<grid[row].length; col++){
				System.out.println(grid[row][col]);
			}
		}
	}
}
