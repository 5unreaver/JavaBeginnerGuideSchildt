package Exercise2_Page84;

/* Упр. 2.2
 * Отображение таблицы истинности для логических операций.*/
class LogicalOpTableVer30March2025 {
    public static void main(String[] args) {
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT"); // выводим первую строку

        // вынесли вычисления в отдельные методы
        printResults(true, true);
        printResults(true, false);
        printResults(false, true);
        printResults(false, false);
    }

    // вынесли перевод boolean to int в отдельный метод
    public static int booleanToInt(boolean b) {
        return b ? 1 : 0;
    }

    // наполняем данными
    public static void printResults(boolean p, boolean q) {
        System.out.print(booleanToInt(p) + "\t" + booleanToInt(q) + "\t");
        System.out.print(booleanToInt(p & q) + "\t" + booleanToInt(p | q) + "\t");
        System.out.println(booleanToInt(p ^ q) + "\t" + booleanToInt(!p));
    }
}