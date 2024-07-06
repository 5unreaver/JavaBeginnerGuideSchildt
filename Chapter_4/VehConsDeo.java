package Chapter_4;

public class VehConsDeo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle musclecar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

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
