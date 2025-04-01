// Сравнение if-else и switch
public class IfElseVsSwitch {
    public static void main(String[] args) throws java.io.IOException {
        int x = 9, y = 1;
        boolean done = true;
        if (x < 10) System.out.println("Переменная x меньше 10");
        else if (y != 0) System.out.println("Переменная y не равна 0");
        /* Логическое условие (!done) тоже не поддерживается в switch.
        В switch можно проверять только конкретные значения (целые, строки, перечисления),
        но не логические выражения или диапазоны.*/
        else if ((x == 1) != done) System.out.println("Variable x contains 1 is " + done);
    }
}
