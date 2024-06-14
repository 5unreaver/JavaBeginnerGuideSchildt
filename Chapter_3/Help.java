class Help {
    public static void main(String[] args)
        throws java.io.IOException { /* ВНИМАНИЕ: если будешь применять 
            метод System.in.read(), то обязательно
            вводи оператор throws java.io.IOException! */

        System.out.println("Справка:\n1. if\n2. switch\nВыберите: ");

        char choice = (char) System.in.read();
        
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
            
            default:
                System.out.println("Запрос не найден.");
        }
    }
}

