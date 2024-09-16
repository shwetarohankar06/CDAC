package assignment.in;

public class Employee {
    // Static fields to track total number of employees and total salary expense
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;

    // Non-static fields for individual employee details
    private int id;
    private String name;
    private double salary;

    // Static initializer to initialize total employees and salary expense
    static {
        System.out.println("Employee class loaded.");
    }

    // Non-static initializer to automatically update employee count and salary expense
    {
        totalEmployees++;
        totalSalaryExpense += this.salary;
    }

    // Constructor to initialize individual employee details
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id2, String name2, int salary2) {
		// TODO Auto-generated constructor stub
	}

	// Getter for employee ID
    public int getId() {
        return id;
    }

    // Setter for employee ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }

    // Setter for employee name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for employee salary
    public double getSalary() {
        return salary;
    }

    // Setter for employee salary with adjustment in total salary expense
    public void updateSalary(double newSalary) {
        totalSalaryExpense = totalSalaryExpense - this.salary + newSalary;
        this.salary = newSalary;
    }

    // Static method to retrieve the total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Static method to apply a percentage raise to the salary of all employees
    public static void applyRaise(double percentage, Employee[] employees) {
        for (Employee emp : employees) {
            double raiseAmount = emp.salary * (percentage / 100);
            emp.updateSalary(emp.salary + raiseAmount);
        }
    }

    // Static method to calculate the total salary expense
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    // Overriding toString method to print individual employee details
    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}
