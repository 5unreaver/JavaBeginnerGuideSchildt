package Chapter_5;
// использование переменной экземпляра length
public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = {1, 2, 3};
        int table[][] = { // таблица со строками переменной длины
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        System.out.println("Размер списка: " + list.length);
        System.out.println("Размер nums: " + nums.length);
        System.out.println("Размер table: " + table.length); // определить число массивов в двумерном массиве

        System.out.println("Размер table[0]: " + table[0].length); // размер отдельного массива в table
        System.out.println("Размер table[1]: " + table[1].length);
        System.out.println("Размер table[2]: " + table[2].length);
        System.out.println();

        // Использовать переменную length для инициализации списка
        for(int i = 0; i < list.length; i++)
            list[i] = i * i;

        System.out.println("Содержимое списка: ");
        for(int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
