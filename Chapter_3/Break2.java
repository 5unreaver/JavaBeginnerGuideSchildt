// Чтение вводимых данных до момента, пока не будет получена буква q.
public class Break2
{
    public static void main(String[] args) throws java.io.IOException    
    {
        char ch;

        for( ; ; )
        {
            ch = (char) System.in.read(); // получить символ с клавиатуры.
            if(ch == 'q') break; // "Бесконечный" цикл, завершаемый оператором break.
        }
        System.out.println("Вы нажали на клавишу q.");
    }  
}
