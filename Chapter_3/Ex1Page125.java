public class Ex1Page125
{
    public static void main(String[] args) throws java.io.IOException
    {
        char ignore, choice;
        int number = 0;

        do
        {
            System.out.println("Введите символ: ");
            choice = (char) System.in.read();
            if (choice == ' ') number++;

            do
            {
                ignore = (char) System.in.read();            
            }
            while(ignore != '\n');
        }
        while(choice != '.');
        System.out.println("Вы ввели пробел целых " + number + " раз! Вы ввели точку, мы прощаемся.");
    }
}