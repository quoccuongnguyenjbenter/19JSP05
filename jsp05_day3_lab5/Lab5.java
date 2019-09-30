package jsp05_day3_lab5;

import java.util.Scanner;

public class Lab5 {
	static Employee[] ds;
	static boolean test = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scc = new Scanner(System.in);
		int enter;
		do {

			System.out.println("1. Create employee: ");
			System.out.println("2. Show the existing employee: ");
			System.out.println("3. Exit: ");
			System.out.println("Enter the choose of you for the menu: ");
			enter = scc.nextInt();
			switch (enter) {
			case 1:
				createEmployee();
				break;
			case 2:
				showEmployee();
				break;
			}

		} while (enter != 3);

	}

	static void createEmployee() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Employee: ");
		int number = sc.nextInt();
		ds = new Employee[number];
		for (int i = 0; i < ds.length; i++) {
			System.out.println("Enter employee " + (i + 1));
			System.out.println("Enter id of Employee: ");
			int id = sc.nextInt();
			System.out.println("Enter name of Employee: ");
			String name = sc.next();
			System.out.println("Enter salary of Employee: ");
			double salary = sc.nextDouble();
			System.out.println("Enter job name of Employee: ");
			String job = sc.next();
			Employee em = new Employee(id, name, salary, job);
			ds[i] = em;
		}
		test = true;
	}

	static void showEmployee() {
		if (test) {
			for (Employee i : ds) {
				i.printInfoOfEmloyee();
			}
		} else {
			System.out.println("Please create employee!!!");
		}

	}

}
