package Chapter_4;

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle musclecar = new Vehicle();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        musclecar.passengers = 2;
        musclecar.fuelcap = 14;
        musclecar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist
        + " миль фургону потребуется "
        + gallons + " галлонов топлива");

        gallons = musclecar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist
        + " миль масл-кару потребуется "
        + gallons + " галлонов топлива");
    }
}
