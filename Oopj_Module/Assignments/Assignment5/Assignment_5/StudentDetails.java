package assignment.in;

class Student{
	private String name;
	private int age;
	private int PrnNumber;
	private String course;
	private String batchYear;
	
	public Student(String name, int age, int prnNumber, String course, String batchYear) 
	{
		super();
		this.name = name;
		this.age = age;
		PrnNumber = prnNumber;
		this.course = course;
		this.batchYear = batchYear;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public int getPrnNumber() {
		return PrnNumber;
	}

	public String getCourse() {
		return course;
	}

	public String getBatchYear() {
		return batchYear;
	}
	
	public void displayStudentsDetails() {
		System.out.println("Student Name: " +name);
		System.out.println("Student Age: " +age);
		System.out.println("Student PRN : " +PrnNumber);
		System.out.println("Student course Name : " +course);
		System.out.println("Student Batch year : " +batchYear);
	}	
	
}

public class StudentDetails {

	public static void main(String[] args) {
		Student student = new Student("Shweta Rohankar", 24, 109, "CDAC" ,"Aug24");
		student.displayStudentsDetails();

	}

}

