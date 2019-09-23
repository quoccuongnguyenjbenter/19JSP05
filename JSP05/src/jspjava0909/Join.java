package jspjava0909;

public class Join {
	public String name="Join";
	public int age=19;
	public String gender="Male";
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
