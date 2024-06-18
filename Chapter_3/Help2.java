class Help2 {
    public static void main(String[] args)
        throws java.io.IOException {
            /* ВНИМАНИЕ: если будешь применять 
            метод System.in.read(), то обязательно
            вводи оператор throws java.io.IOException! */
            
        char ignore, choice;
        
        do {
            System.out.println("Справка: \n1. if \n2. switch \n" +
            "3. for \n4. while \n5. do-while \n" + "Выберите: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();            
            } while(ignore != '\n');
        } while(choice < '1' | choice > '5');
        
        switch(choice) {
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
        }
    }
}