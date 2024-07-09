package Chapter_5;
// Упр. 5.1. Демонстр-ия алгоритма пузырьковой сортировки.
public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978,
                        5623, 463, -9, 287, 49};
        int a, b, t;
        int size;

        size = 10; // кол-во сортируемых элементов.



        // Отобразить исходный массив:
        System.out.print("Исходный массив:");
        showArray(nums);

        // Пример реализации алгоритма пузырьковой сортировки
        for(a = 1; a < size; a++)
            for(b = size - 1; b >= a; b--) {
                if(nums[b - 1] > nums[b]) { // если требуемый порядок следования
                                            // не соблюдается, поменять элементы местами.
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        // Отобразить отсортированный массив
        System.out.print("Отсортированный массив:");
        showArray(nums);
    }

    public static void showArray(int[] arr) {
        for(int i = 0; i < arr.length; i++)
        System.out.print(" " + arr[i]);
    System.out.println();
    }
}
