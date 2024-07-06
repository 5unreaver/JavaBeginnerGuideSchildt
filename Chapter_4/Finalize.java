package Chapter_4;

/* Упражнение 4.2
 * Демонстрация сборки мусора и метода finalize()
 */
public class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);

        /* Генерируется большое кол-во объектов.
         * В какой-то момент времени должна начаться сборка мусора.
         * Прим.: возможно, для того, чтобы активизировать
         * систему сборки мусора, кол-во генерируемых объектов
         * придётся увеличить.
         */

         for(count = 1; count < 320000; count++)
            ob.generator(count);
    }

}

class FDemo {
    int x;

    FDemo(int i) {
    x = i;
    }

    // Вызывается при удалении объекта.
    protected void finalize() {
        System.out.println("Финализация " + x);
    }

    // Генерирует объект, который тотчас уничтожается
    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}