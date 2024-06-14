/* Упр. 2.2
 * Отображение таблицы истинности для логических операций.*/
class LogicalOpTableVer3 {
    public static void main(String[] args) {
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        boolean[][] values = { // массив
            {true, true},
            {true, false},
            {false, true},
            {false, false}
        };

        // Вывод значений для каждой пары p и q
        for (boolean[] pair : values) {
            boolean p = pair[0];
            boolean q = pair[1];
            printResults(p, q);
        }
    }

    public static int booleanToInt(boolean b) {
        return b ? 1 : 0;
    }

    public static void printResults(boolean p, boolean q) {
        System.out.print(booleanToInt(p) + "\t" + booleanToInt(q) + "\t");
        System.out.print(booleanToInt(p & q) + "\t" + booleanToInt(p | q) + "\t");
        System.out.println(booleanToInt(p ^ q) + "\t" + booleanToInt(!p));
    }
}
