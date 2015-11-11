package App;

class person{
	private int id;
	private String name;
	
	public person(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		person p1 = new person(1,"Zhaoli");
		person p2 = new person(2,"Liang");
		person p3 = new person(1,"Zhaoli");
		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		System.out.println("\n");
		Double v1 = 7.2;
		Double v2 = 7.2;
		System.out.println(v1 == v2);
		System.out.println(v1.equals(v2));

		System.out.println("\n");
		Integer i1 = 7;
		Integer i2 = 7;
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		System.out.println("\n");
		String t1 = "text";
		String t2 = "text";
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		
		System.out.println("\n");
		String t3 = "text";
		String t4 = "texthello".substring(0,4);
		System.out.println(t3 == t4);
		System.out.println(t3.equals(t4));
	}

}
