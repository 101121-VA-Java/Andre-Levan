package inheritance;

/*Here I have made my Car class Abstract, however the subclass Car1 is still able to access the traits inside Car,
 * this is a benefit of inheritance when dealing with abstract classes.
 */
//Below I am creating an interface to contain the passenger id numbers.
interface variable{
	int[] passengerID = {46, 81, 10};
	int gasMilageCity = 28;
	int gasMilageHwy = 34;
	int gasMilageECO = 40; //A new eco mode has been invented allowing a car to get 40 MPG no matter the location.
}
abstract class Car {
	/*This String is protected to prevent any other packages from accessing this variable, in this case we are
	 * protecting the Ford String from being access by anything outside the package. Subclasses and methods within
	 * the package can still access this String.
	 */
	protected String make = "Ford";
	private String name;  //This will be our variable that will not be shown nor allow to be modified.
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
	public void drivername(String newName) {
		name = newName;
	}
	/*Here I've created a method called averageMPG, the first one is prior to the invention of ECO mode, the next is after
	 * the code will determine the average gas milage for all possibilities via method overloading.
	 */
	
	public static int averageMPG(int gasMilageCity, int gasMilageHwy) {
		return ((gasMilageCity + gasMilageHwy)/2);
		
	}
	public static int averageMPG(int gasMilageCity, int gasMilageHwy, int gasMilageECO) {
		return ((gasMilageCity + gasMilageHwy + gasMilageECO)/2);
	}
	/*Method overloading allows me to reuse the averageMPG method and simply add more parameters
	 * whenever i need to add more.
	 */
}
