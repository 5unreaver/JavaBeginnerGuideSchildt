// Ещё один пример применения оператора break с меткой.
public class Break5
{
    public static void main(String[] args)
    {
        done: // расположение метки имеет большое значение.
            for(int i=0; i<10; i++)
            {
                for(int j=0; j<10; j++)
                {
                    for(int k=0; k<10; k++)
                    {
                        System.out.println(k + " ");
                        if(k == 5) break done; // переход по метке done
                    }
                    System.out.println("После цикла по k");
                }
                System.out.println("После цикла по j");
            }
            System.out.println("После цикла по i");
    }
}