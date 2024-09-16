package assignment.in;

class Animal{
	private String name;
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	public void eat() {
		System.out.println(name + " is eating.");
			
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
	
	public String getName() {
		return name;
	}
}
//subclass
class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(getName() + " is barking.");
	}
}

public class InheritanceAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal("Bear");
		animal.eat();
		animal.sleep();
		
		System.out.println();
		
		Dog dog = new Dog("Teddy");
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		

	}

}
