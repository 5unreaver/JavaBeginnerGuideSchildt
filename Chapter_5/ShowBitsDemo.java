package Chapter_5;
/*
 * Упр. 5.3
 * Создание класса для отображения значений в двоичном коде
 */

 // демонстрация использования класса ShowBits
public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n87987 в двоичном представлении: ");
        i.show(87987);

        System.out.println("\n237658768 в двоичном представлении: ");
        li.show(237658768);

        // Можно также отобразить младшие разряды любого числа
        System.out.println("\nМладшие 8 битов числа 87987 в двоичном представлении");
        b.show(87987);
    }
}

// Конструктор класса ShowBits позволит создавать объекты, отображающие заданное число битов.
class ShowBits {
    int numbits;

    ShowBits(int n) {
        numbits = n;
    }


    // Вывод двоичных значений из класса ShowBits
    void show(long val) {
        long mask = 1;

        // сдвинуть значение 1 влево на нужную позицию
        mask <<= numbits-1;

        int spacer = 0;
        for(; mask != 0; mask >>>= 1) {
            if((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

