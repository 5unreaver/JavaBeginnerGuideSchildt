/* Выполнение цикла до тех пор, пока с клавиатуры
не будет введена буква S. */
class ForTest {
    public static void main(String[] args)
        throws java.io.IOException {
        
            int i;
            System.out.println("Для остановки нажмите клавишу S");
            for(i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Проход #" + i);
    }
}
/* Почему цикл повторяется трижды?
из-за особенностей работы метода System.in.read(),
который считывает байты из входного потока.
Каждый раз, когда вы вводите символ и нажимаете клавишу "Enter",
в поток попадают не только сам символ,
но и управляющие символы новой строки (\n) и возврата каретки (\r).*/