// Демонстрация приведения типов
class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.; y = 3.;
        i = (int) (x / y); // привести тип double к типу int. Теряется дробная часть числа.
        System.out.println("Целочисленный рез-т деления x / y: " + i);

        i = 100;
        b = (byte) i; /* в этом случае информация не теряется,
        ибо byte может содержать 100 */
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i; // информация теряется, ибо byte не может содержать 257
        System.out.println("Значение b: " + b);

        b = 88; // Представление символа X в коде ASCII
        ch = (char) b; // явное приведение несовместимых типов
        System.out.println("ch: " + ch);
    }
}