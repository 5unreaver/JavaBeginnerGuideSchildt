package Chapter_4;

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle musclecar = new Vehicle();

        int range, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значения полям в объекте musclecar
        musclecar.passengers = 2;
        musclecar.fuelcap = 14;
        musclecar.mpg = 12;

        // Рассчитать дальность поездки при полном баке.
        range = minivan.mpg * minivan.fuelcap;
        System.out.println("Фургон может провезти " + minivan.passengers
        + " человек на " + range + " миль.");

        range2 = musclecar.mpg * musclecar.fuelcap;
        System.out.println("Маслкар может провезти " + musclecar.passengers
        + " человек на " + range2 + " миль.");
    }
}
