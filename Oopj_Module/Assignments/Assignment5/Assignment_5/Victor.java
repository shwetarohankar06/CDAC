package assignment.in;

	class vehicle{
		private String make;
		private int year;
		
		public vehicle(String make, int year) {
			this.make = make;
			this.year = year;
		}
		
		public String getMake() {
			return make;
		}
		public int getYear() {
			return year;
		}
		public void displayDetails() {
			System.out.println("Make: " + make);
	        System.out.println("Year: " + year);	
		}
		
	}

	class Car extends vehicle {
		private String model;

		public Car(String make, int year, String model) {
			super(make, year);
			this.model = model;
		}
		public String getModel() {
			return model;
		}

		
		 @Override
		    public void displayDetails() {
		        super.displayDetails(); // Display make and year from Vehicle
		        System.out.println("Model: " + model); // Display model from Car
		    }
	}

		 public class Victor {
		
			 public static void main(String[] args) {
	        // Create a Car object
				 Car car = new Car("Toyato", 2009, "Fortuner");

	        // Display the car details
				 car.displayDetails();
			 }
		 }
