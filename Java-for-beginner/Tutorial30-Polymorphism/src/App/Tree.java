package App;

public class Tree extends Plant{

	public Tree(){
		grow();
	}
	
	@Override
	public void grow() {
		// TODO Auto-generated method stub
		System.out.println("Tree is growing !");
	}
	
	public void shedLeaves(){
		System.out.println("Leaves sheding !");
	}

}
