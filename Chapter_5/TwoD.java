package Chapter_5;
// Демонстрация использования двумерного массива.
public class TwoD {
    public static void main(String[] args) {
        int t, i;
        // int table[][] = new int[3][4];
        int table[][] = new int[3][];
        table[0] = new int[4];
        table[0] = new int[4];
        table[0] = new int[4];

        for(t = 0; t < 3; ++t) {
            for(i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}
// table[2][3] содержит 12, ибо нумерация с нуля.