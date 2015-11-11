package App;

class Person {
	
	String name;
	String gender;
	int age;
	String country;
	
	void print() {
		System.out.println("My Name is: " +
				this.name + ";  Gender: " + 
				this.gender + ";  I am living in: " +
				this.country + ";  and my age is: " +
				this.age + ";  I still have: "+ 
				this.calculateYearToRetirement()+ " years till to retire;");
	}
	
	public void setName(String str) { name = str; }
	public void setGender(String str) { gender = str;}
	public void setAge(int _age) { age = _age;}
	public void setCnty(String cnty) { country = cnty;}
	
	public String getName(){ return name; }
	public String getGender(){ return gender; }
	public int getAge(){ return age; }
	public String getCnty(){ return country; }
	
	int calculateYearToRetirement(){
		int yearleft = 65 - age;
		return yearleft;
	}
}

public class Application {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Liang Xue";
		p1.gender = "M";
		p1.country = "USA";
		p1.age = 32;
		
		System.out.println("My Name is: " +
							p1.name + ";  Gender: " + 
							p1.gender + ";  I am living in: " +
							p1.country + ";  and my age is: " +
							p1.age + ";  I still have: "+ 
							p1.calculateYearToRetirement()+ " years till to retire;");
		System.out.println("");		
		p1.print();
		
		Person p2 = new Person();
		p2.setName("Zhaoli Liu");
		p2.setGender("F");
		p2.setAge(30);
		p2.setCnty("USA");
		System.out.println("");		
		System.out.println("My Name is: " +
				p2.name + ";  Gender: " + 
				p2.gender + ";  I am living in: " +
				p2.country + ";  and my age is: " +
				p2.age + ";  I still have: "+ 
				p2.calculateYearToRetirement()+ " years till to retire;");
		System.out.println("");		

	}

}
