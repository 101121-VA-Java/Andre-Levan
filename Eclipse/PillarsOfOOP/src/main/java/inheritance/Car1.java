package inheritance;

/*Here we are extending the Car1 class to be the child of the Car class. This allows us to use the methods in the car class
 * without needing to rewrite all the methods already created. */
public class Car1 extends Car{
     public String model = "Mustang";
     int year = 2020;
     
     public void main(String[] args) {
    	 Car car1 = new Car();
         car1.ignition();
         }
     public void greet() {
 		System.out.println("I'm a " + year +" "+ make + " "+ model);
 	}
     /*Below we are method overriding the accelerate method in Car.java, to allow the car to accelerate more quickly.
     This allows us to modify the accelerate method for each car we want, so fast cars we create can move quickly and slower ones move more slowly.*/
     public void accelerate() {
 		System.out.println("Vroom! "+ make + " "+ model +" moved forward " + "10" + " feet");
 	}
}
