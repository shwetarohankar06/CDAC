package employee;

import java.util.Scanner;

class program {
	private int empid;
	private String name;
	private String City;
	private float Salary;
	Scanner sc = new Scanner(System.in);
	public void setData() {
		
		System.out.print("Enter the empid: ");
		empid = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the name: ");
		name = sc.nextLine();
		System.out.print("Enter the City: ");
		City = sc.nextLine();
		System.out.print("Enter the Salary: ");
		Salary = sc.nextFloat();
		//sc.close();
	}

	public void getAccessData() {
		System.out.println("Employee id is:		" + empid);
		System.out.println("Name is: 	" + name);
		System.out.println("City is:	" + City);
		System.out.println("Salary is: 	" + Salary);
	}
}

public class EmployeeInformation {
	public static void main(String[] args){
	program emp1 = new program ();
	program emp2 = new program();
	emp1.setData();
	emp1.getAccessData();
	emp2.setData();
	emp2.getAccessData();
	
 }
}
