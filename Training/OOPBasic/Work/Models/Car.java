package Training.OOPBasic.Work.Models;

public class Car{
    public int year;
    public boolean hasBeenInAccident;
    public String make;
    public int gasMileage;

    public Car(){}

    public Car(int year, boolean hasBeenInAccident, String make, int gasMileage){
        this.year = year;
        this.hasBeenInAccident = hasBeenInAccident;
        this.make = make;
        this.gasMileage = gasMileage;
    }
}