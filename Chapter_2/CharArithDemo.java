/*
 * С символьными переменными можно обращаться как с целочисленными.
 */

class CharArithDemo {
    public static void main(String[] args) {
        char ch;
        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++; // инкрементировать переменную ch
        System.out.println("Теперь ch содержит " + ch);

        ch = 90; // переменной можно присваивать целочисленные значения.
        System.out.println("Теперь ch содержит " + ch);

    }
}
