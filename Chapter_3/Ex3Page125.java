public class Ex3Page125
{
    public static void main(String[] args)
    {
        int x = 9, y = 99, z = 1;
        boolean done = true;

        // Задание 3:
        /*
        if (x < 10)
            if (y > 100)
            {
                if (!done) x = z;
                else y = z;
            }
            else System.out.println("\nError!\n"); // к какому оператору if относится?
            // ко второму, который (y > 100), ибо там нет фигурных скобок!
        */

        // задание 4:
        /*
        for(int f = 1000; f >= 0; f -= 2)
        {
            if (f != 0) System.out.print(f + ", ");
            else System.out.println(f + ".");
        }
        */

        // задание 5:
        int num = 4, sum = 1, count;
        for(int i = 0; i < num; i++) {
            sum += i;
            System.out.println(i);
        }
        // count = i; // некорректно, поскольку i объявлена лишь в for.
        System.out.println(sum);
        // он накидывает значение +1 после выполнения сложения в sum, поэтому там 7
    }
}
