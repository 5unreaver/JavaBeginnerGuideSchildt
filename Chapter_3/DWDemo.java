// Демон-ия исп-ия цикла do-while
class DWDemo {
    public static void main(String[] args)
        throws java.io.IOException {

            char ch;

            do {
                System.out.
                    println("Нажмите нужную клавишу, а затем клавишу <ENTER>: ");
                        ch = (char) System.in.read(); // получить символ с клавиатуры.
            } while(ch != 'q');
        }        
    }