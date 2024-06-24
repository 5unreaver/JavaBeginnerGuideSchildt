/* Упражнение 3.3

Завершённая справочная система по управляющим
операторам Java, обрабатывающая многократные запросы */
class Help3
{
    public static void main(String[] args)
        throws java.io.IOException
        {
            /* ВНИМАНИЕ: если будешь применять 
            метод System.in.read(), то обязательно
            вводи оператор throws java.io.IOException! */
            
        char ignore, choice;
        
        for(;;)
        {
            do
            {
                System.out.println("Справка: \n1. if \n2. switch \n" +
                "3. for \n4. while \n5. do-while \n" +
                "6. break \n7. continue\n" + "Выберите (q - выход): ");

                choice = (char) System.in.read();

                do
                {
                    ignore = (char) System.in.read();            
                } while(ignore != '\n');
            } while(choice < '1' | choice > '7' & choice != 'q');

            if(choice == 'q') break;

            System.out.println("\n");
            
            switch(choice)
            {
                case '1':
                    System.out.println("Оператор if:\n");
                    System.out.println("if(условие) оператор;\nelse оператор;");
                break;

                case '2':
                    System.out.println("Оператор switch:\n");
                    System.out.println("switch(выражение) {\n case константа:\n" +
                    " последовательность операторов\n" +
                    " break;\n" + " // ...\n" + "}");
                break;

                case '3':
                    System.out.println("Оператор for:\n");
                    System.out.println("for(инициализация; условие; итерация)\n" +
                    " оператор;");
                break;

                case '4':
                    System.out.println("Оператор while:\n");
                    System.out.println("while(условие) оператор;");
                break;

                case '5':
                    System.out.println("Оператор do-while:\n");
                    System.out.println("do {\n оператор;\n } while(условие);");
                break;

                case '6':
                    System.out.println("Оператор break:\n");
                    System.out.println("break; или break метка;");
                break;

                case '7':
                System.out.println("Оператор continue:\n");
                System.out.println("continue; или continue метка;");
            break;
            }
        System.out.println();
        }
    }
}