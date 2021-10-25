package Training.OOPBasic.Work.Models;

public class Driver{
    public boolean hasSeatBelt;
    public String name;
    public int age;
    public boolean hasLicense;
    public boolean isDrunk;

    public Driver(){}

    public Driver (boolean hasSeatBelt, String name, int age, boolean hasLicense, boolean isDrunk){
        this.hasSeatBelt = hasSeatBelt;
        this.name = name;
        this.age = age;
        this.hasLicense = hasLicense;
        this.isDrunk = isDrunk;
    }
    public String vroom(String vroom){
        return "Can't stop, won't stop," + vroom;
    }
}