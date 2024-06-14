/* Упр. 2.2
 * Отображение таблицы истинности для логических операций.*/
class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true; /* "Cannot cast from int to boolean"
        при попытке явно привести int к boolean и наоборот.
        При if также ругается на приведение несовместимых типов:
        Type mismatch: cannot convert from int to boolean*/
        int int1 = p ? 1 : 0; // тернарный оператор.
        int int2 = q ? 1 : 0;
        System.out.print(int1 + "\t" + int2 + "\t");
        System.out.print((int1&int2) + "\t" + (int1|int2) + "\t");
        System.out.println((int1^int2) + "\t" + (!p)); /* The operator ! is undefined for the argument type(s) int
        */

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
    }
}
