package Chapter_4;

class Help {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        Help hlpobj = new Help();

        for(;;) {
            do {
                hlpobj.showmenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while ( !hlpobj.isvalid(choice) );

            if(choice == 'q') break;

            System.out.println("\n");
            hlpobj.helpon(choice);
            }
        }

    void helpon(int what) {
        switch(what)
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

    void showmenu() {
        System.out.println("Справка: \n1. if \n2. switch \n" +
                "3. for \n4. while \n5. do-while \n" +
                "6. break \n7. continue\n" + "Выберите (q - выход): ");
    }

    boolean isvalid(int ch) {
        if(ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}