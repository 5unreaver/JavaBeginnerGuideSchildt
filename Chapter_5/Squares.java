package Chapter_5;
// Инициализация двумерного массива
public class Squares {
    public static void main(String[] args) {
        int sqrs[][] = {
            {1, 1},
            {2, 4},
            {3, 9},
            {4, 16},
            {5, 25},
            {6, 36},
            {7, 49},
            {8, 64},
            {9, 81},
            {10, 100}
        };
        int i, j;

        for(i = 0; i < 10; i++) {
            for(j = 0; j < 2; j++)
                System.out.print(sqrs[i][j] + " ");
            System.out.println();
        }

        // Альтернативный синтаксис объявления массивов (с одномерными аналогично):
        char table[][] = new char[3][4];
        char[][] table1 = new char[3][4];
        
        // Альтерн. форма удобна, если требуется объявить несколько массивов одного типа:
        int[] nums, nums2, nums3;
        int nums4[], nums5[], nums6[];

        // Альтерн. форма, если в кач-ве типа, возвращаемого методом, требуется указать массив:
        // int[] someMeth() {}
    }
}
