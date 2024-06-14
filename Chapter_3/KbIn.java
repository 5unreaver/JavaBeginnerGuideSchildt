// Чтение символа с клавиатуры.
class KbIn {
    public static void main(String[] args)
        throws java.io.IOException {

            char ch;

            System.out.print("Нажмите нужную клавишу, а затем клавишу ENTER: ");
            ch = (char) System.in.read(); // получить символ

            System.out.println("Вы нажали клавишу " + ch);
    }
}