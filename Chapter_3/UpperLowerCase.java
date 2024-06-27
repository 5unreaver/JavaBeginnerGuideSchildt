// Задание 10, стр. 126
public class UpperLowerCase
{
    public static void main(String[] args)
    throws java.io.IOException
    {
        char ch, ignore;
        int i = 0;

        System.out.println("Ввод символа '.' завершит выполнение программы.");
        
        for(;;)
        {
            System.out.println("Для изменения регистра введите любую букву от A до Z: ");
            ch = (char) System.in.read(); // Получить символ с клавиатуры.
    
            do
            {
                ignore = (char) System.in.read();            
            } while(ignore != '\n');

            if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
            {
                ch = (ch >= 65 && ch <= 90) ? (ch += 32) : (ch -= 32);
                System.out.println("Преобразовано в: " + ch);
                i++;
            }
            else if(ch != 46) System.out.println("Ошибка.");
            else break;
        }
        System.out.println("Вы преобразовали " + i + " букв и вышли из программы.");
    }
}
