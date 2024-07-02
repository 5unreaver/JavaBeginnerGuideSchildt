package Chapter_4;

public class AddMeth {
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

        System.out.print("Мини-фургон может перевезти "
            + minivan.passengers + " пассажиров. ");

        minivan.range(); // отобразить дальность поездки мини-фургона.

        System.out.print("Маслкар может провезти"
            + musclecar.passengers + " пассажиров. ");

        musclecar.range();
    }
}
