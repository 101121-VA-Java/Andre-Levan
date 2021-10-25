package inheritance;

public class Car {
	protected String make = "Ford";
    int year = 2000;
	
	public static void ignition() {
		System.out.println("*Engine turns over sound*");
	}
	public void accelerate() {
		System.out.println("Car moved forward " + "5" + " feet");
	}
	public void brake() {
		System.out.println("Presses on brakes.");
	}
	public void honk() {
		System.out.println("Honk! Honk!");
	}
}
