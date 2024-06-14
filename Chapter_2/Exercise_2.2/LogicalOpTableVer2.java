/* Упр. 2.2
 * Отображение таблицы истинности для логических операций.*/
class LogicalOpTableVer2 {
    public static void main(String[] args) { // в Яве всегда начинаем с функции main
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        function(true, true);
        function(true, false);
        function(false, true);
        function(false, false);
    }
    public static void function(boolean p, boolean q) { // каждому параметру дать определение типа
        // Какие параметры новая функция должна принимать?
        int pInt = p ? 1 : 0;
        int qInt = q ? 1 : 0;
        int pANDqInt = (p&q) ? 1 : 0;
        int pORqInt = (p|q) ? 1 : 0;
        int pXORqInt = (p^q) ? 1 : 0;
        int notPInt = (!p) ? 1 : 0;

        System.out.print(pInt + "\t" + qInt + "\t");
        System.out.print(pANDqInt + "\t" + pORqInt + "\t");
        System.out.println(pXORqInt + "\t" + notPInt);
    }
}
