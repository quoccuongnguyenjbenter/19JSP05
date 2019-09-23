package jspjava0909;

public class Dogs {
	public String name;
	public int age;
	public String color;
	
	Dogs(String Name, int Age, String Color) {
		this.name=Name;
		this.age=Age;
		this.color=Color;
	}
	
	void waggingTheTail() {
		System.out.println("dang vay duoi");
	}
	
	void barking() {
		System.out.println("dang sua");
	}
	
	void eating() {
		System.out.println("dang an");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs dog1= new Dogs("Liz", 10, "While");
		dog1.barking();
		
	}

}
