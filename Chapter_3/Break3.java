// Применение оператора break во вложённых циклах.
public class Break3
{
    public static void main(String[] args)
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("Счётчик внешнего цикла: " + i);
            System.out.print(" Счётчик внутреннего цикла: ");

            int t = 0;
            while(t < 100)
            {
                if(t == 10) break; // прервать цикл, если t = 10.
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
    
}
