// Демонстрация многоступенчатой констр. if-else-if.
class Ladder {
    public static void main(String[] args) {
        int x;

        for(x=0; x<6; x++) {
            if(x==1)
                System.out.println("x равен 1");
            else if(x==2)
                System.out.println("x равен 2");
            else if(x==3)
                System.out.println("x равен 3");
            else if(x==4)
                System.out.println("x равен 4");
            else
            System.out.println("Значение x вне пределов диапазона 1 - 4");
        }
    }
}
