package jspjava0909;

public class Juli {
	public String name="Juli";
	public int age=20;
	public String gender="Female";
	void getName(String Name, int Age, String Gender) {
		this.name=Name;
		this.age=Age;
		this.gender=Gender;
	}
	void getInfo() {
		System.out.println("Name is: "+name);
		
		System.out.println("Age is: "+age);
		
		System.out.println("Gender is: "+gender);
	}
}
