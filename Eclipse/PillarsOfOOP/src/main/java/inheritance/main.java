package inheritance;

public class main {

	public static void main(String[] args) {
         Car1 c1 = new Car1();
         c1.ignition();
         c1.greet();
         c1.accelerate();
         c1.brake();
         c1.honk();
         c1.year();
         //Below I attempt to access the passengerIDs of those in the car, it will return an exception. I will have it handled by printing that you are unable to access that information.
         
         try {
        	 int[] passengerID = {46, 81, 10};
        	 System.out.println(passengerID[3]);
         }catch(Exception e){
        	 System.out.println("Sorry, you can't access that information!");
         }
         //Above we have caught the exception and printed the response to the console denying the information.
	}

}
