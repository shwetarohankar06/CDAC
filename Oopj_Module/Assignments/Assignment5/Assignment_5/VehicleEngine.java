package assignment.in;

	class Vehicle1 {
	    public void startEngine() {
	        System.out.println("The vehicle's engine is starting.");
	    }

	    public void stopEngine() {
	        System.out.println("The vehicle's engine is stopping.");
	    }
	}

	// Subclass Car
	class Car1 extends Vehicle1 {
	    @Override
	    public void startEngine() {
	        System.out.println("The car's engine is starting.");
	    }

	    @Override
	    public void stopEngine() {
	        System.out.println("The car's engine turns off smoothly.");
	    }
	}

	// Subclass Motorcycle
	class Motorcycle extends Vehicle1 {
	    @Override
	    public void startEngine() {
	        System.out.println("The motorcycle's engine starts with a button press.");
	    }

	    @Override
	    public void stopEngine() {
	        System.out.println("The motorcycle's engine shuts down quickly.");
	    }
	}

	public class VehicleEngine {
	    public static void main(String[] args) {
	        Vehicle1 car = new Car1();
	        System.out.println("Car:");
	        car.startEngine();
	        car.stopEngine();

	        System.out.println();
	        Vehicle1 motorcycle = new Motorcycle();
	        System.out.println("Motorcycle:");
	        motorcycle.startEngine();
	        motorcycle.stopEngine();
	    }
	}
