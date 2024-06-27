// Задача 9. Геометрическая прогрессия.
public class Ex9Page125GeomProgress
{
    public static void main(String[] args)
    {
        int q = 2, sum = 0; // i первый член прогрессии, q - знаменатель;
        // sum - номер значения.

        for(int i = 1; i <= 32; i *= q)
        {
            sum += sum + sum + i;
            System.out.print(i + " ");
        } 
    }
    
}
