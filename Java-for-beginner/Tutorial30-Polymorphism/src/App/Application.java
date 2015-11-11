package App;

public class Application {
	
	public static void main(String[] args){
	
		Plant p1 = new Plant();	

		/// print twice "Tree is growing"
		Tree t1 = new Tree();
		t1.shedLeaves();
		
		/// polym, print twice "Tree is growing" 
		// (1) allocate memory
		// (2) call constructor in Plant, (will call Tree::grow() )
		// (3) call constructor in Tree
		Plant p2 = new Tree();
//		p2.shedLeaves();  /// no shedLeaves() in Plant, compile error
		
//		doGrow(t1);
	}

	public static void doGrow(Plant p){
		p.grow();
	}
}
