/*
 * Демонстрация применения блоков кода.
 * Присвойте файлу с исходным кодом имя BlockDemo.java.
 */
class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;
        i = 0;
        j = 10;

        // Телом этого оператора if является целый лок кода.
        if(i != 0) {
            System.out.println("i не равен нулю");
            d = j / i;
            System.out.println("j / i равно " + d);
        }
    }
}