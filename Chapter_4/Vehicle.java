package Chapter_4;

public class Vehicle {
    int passengers, fuelcap, mpg;

    
    void range() {
        System.out.println("Дальность - " + fuelcap * mpg + " миль.");
    }
}
