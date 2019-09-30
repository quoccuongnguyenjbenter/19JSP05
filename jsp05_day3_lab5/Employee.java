package jsp05_day3_lab5;

public class Employee {
	public String name;
	public double salary;
	public int id;
	public String job;
	Employee(int id, String name, double salary, String job){
		this.name=name;
		this.salary=salary;
		this.id=id;
		this.job=job;
	}
	public void printInfoOfEmloyee() {
		System.out.println(id+"   "+name+"   "+salary+"   "+job);
	}
}
