package Chapter_4;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Рассчитать дальность поездки при полном баке.
        range = minivan.mpg * minivan.fuelcap;
        System.out.println("Фургон может провезти " + minivan.passengers
        + " человек на " + range + " миль.");
    }
}
