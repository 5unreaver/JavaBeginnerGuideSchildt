/*
 * Демонстрация использования переменных.
 * Присвойте файлу с исходным кодом имя Example2.java
 */

class Example2 {
    public static void main(String[] args) {
        /*int var1; // объявляется переменная
        int var2; // объявляется ещё одна переменная
        */

        int var1, var2;
        var1 = 1024;

        System.out.println("Переменная var1 содержит " + var1);

        var2 = var1 / 2;

        /* System.out.print("Переменная var2 содержит var1 / 2: ");
        System.out.println(var2); */
        System.out.print("Переменная var2 содержит var1 / 2: " + var2);
    }  
}