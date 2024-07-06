package Chapter_4;

public class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle musclecar = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        musclecar.passengers = 2;
        musclecar.fuelcap = 14;
        musclecar.mpg = 12;

        System.out.println("Мини-фургон может перевезти "
            + minivan.passengers + " пассажиров на расстояние " + minivan.range() + " миль.");
        System.out.println("Маслкар может провезти"
            + musclecar.passengers + " пассажиров на расстояние " + musclecar.range() + " миль.");

        if(minivan.range() > musclecar.range()) System.out.println("Фургон проедет дальше.");
    }
}
