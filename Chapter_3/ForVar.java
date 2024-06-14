// Объявление переменной цикла for в самом цикле for
class ForVar {
    public static void main(String[] args) {
        int sum = 0, fact = 1;

        // вычисление факториала от 1 до 5
        for(int i = 1; i <= 5; i++) { // переменная i объявл. в самом операторе for
            sum += i;
            fact *= i;
        }

        // Однако здесь переменная i недоступна.

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
