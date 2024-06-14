// Демон-ия исп-ия оператора switch
class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for(i=0; i<10; i++)
            switch(i) {
                case 0:
                    System.out.println("i равен 0");
                    break; // оператор switch заверш. работу при вып-ии оператора break.
                case 1:
                    System.out.println("i равен 1");
                    break;
                case 2:
                    System.out.println("i равен 2");
                    break;
                case 3:
                    System.out.println("i равен 3");
                    break;
                case 4:
                    System.out.println("i равен 4");
                    break;
                default:
                    System.out.println("i больше или равен 5");
                    break;
            }
    }
}
