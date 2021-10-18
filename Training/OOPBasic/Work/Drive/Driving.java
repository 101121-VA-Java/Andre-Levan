package Training.OOPBasic.Work.Drive;

import Training.OOPBasic.Work.Models.Car;
import Training.OOPBasic.Work.Models.Driver;

public class Driving{

    public static void main(String[] args){

        Driver Tony = new Driver(false,"Tony Lazuto", 45, false, true);

        System.out.println(Tony.isDrunk);
        System.out.println(Tony.vroom("gotta go fast"));
        System.out.println("Hello");
    }
}