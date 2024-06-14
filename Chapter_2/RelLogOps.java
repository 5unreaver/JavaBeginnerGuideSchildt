/* Демонстрация использ-ия операций сравнения
 * и логических операций. */
class RelLogOps {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j"); // знак < > всегда перед =
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("i == j");
        if(i >= j) System.out.println("i >= j");
        if(i > j) System.out.println("i > j");

        b1 = true; b2 = false;
        if(b1 & b2) System.out.println("Это не будет выполнено"); // И
        if(!(b1 & b2)) System.out.println("!(b1 & b2): true"); // НЕ
        if(b1 | b2) System.out.println("b1 | b2: true"); // ИЛИ
        if(b1 ^ b2) System.out.println("b1 ^ b2: true"); /* Исключающее ИЛИ. Результат будет true,
        если операнды различны */
    }
}
