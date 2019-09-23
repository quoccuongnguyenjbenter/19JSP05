package jspjava0909;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dave dave=new Dave();
//		dave.getName("Dave", 19, "Male");
		System.out.println("Age of Dave is: "+dave.age);
		dave.getInfo();
		Join join=new Join();
		join.getName("Join", 20, "Male");
		join.getInfo();
		Juli juli=new Juli();
		juli.getName("Juli", 21, "Female");
		juli.getInfo();
	}

}
