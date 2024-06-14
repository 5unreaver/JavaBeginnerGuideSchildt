// Демон-ия исп-ия оператора switch без оператора break
class NoBreak {
    public static void main(String[] args) {
        int i;

        for(i=0; i<=5; i++) {
            /* switch(i) {
                case 0:
                    System.out.println("i меньше 1");
                case 1:
                    System.out.println("i меньше 2");
                case 2:
                    System.out.println("i меньше 3");
                case 3:
                    System.out.println("i меньше 4");
                case 4:
                    System.out.println("i меньше 5");
            }
            System.out.println();*/

            switch(i) {
                case 1: /* Заметь, тут i=0 изначально, но он проигрывает
                только по кейсам. Т. е. если у нас i=-1, он проиграет
                всё равно только с case 1.
                Т. е. он как бы пропустит -1, 0 и 5.
                Константы важны, чтобы хоть что-то проигрывалось.
                Если у нас будет только, условно, case 6, то у нас вообще ничего не выведет.*/
                case 2:
                case 3: System.out.println("i равно 1, 2 или 3");
                    break;
                case 4: System.out.println("i равно 4");
                    break;
            }
            
            switch(ch1) {
                case 'A': System.out.
                println("Это раздел A общего оператора switch");
                    switch(ch2) {
                        case 'A': System.out.
                            println("Это раздел A внутреннего оператора switch");
                        break;
                        case 'B': // ...
                    } // конец внутреннего оператора switch
                break;
                case 'B':
            }
        }
    }
}