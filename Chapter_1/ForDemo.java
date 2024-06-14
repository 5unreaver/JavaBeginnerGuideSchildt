/*
 * Демонстрация применения цикла for.
 * Присвойте файлу с исходным кодом имя ForDemo.java.
 */
class ForDemo {
    public static void main(String[] args) {
        int count;

        // for(count = 0; count < 5; count = count + 1) // count - переменная цикла
        for(count = 0; count < 5; count = count++) // "++" - оператор инкремента, заменяющий "+1"
            System.out.println("Значение счётчика: " + count);
        System.out.println("Готово!");
    }
}