// Демонстрация динамической инициализации.
class DinInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;
        // переменная volume иниц-ся динамически
        // во время вып-ия программы.
        double volume = 3.1416 * radius * radius * height;
        System.out.println("Объём: " + volume);
    }
}
