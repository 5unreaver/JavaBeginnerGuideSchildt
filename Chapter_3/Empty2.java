// Пропуск отдельных составляющих в определении цикла for
class Empty2 {
    public static void main(String[] args) {
        int i = 0; // из опред-ия цикла исключена инициализирующая часть.

        for(; i < 10; ) {
            System.out.println("Проход #" + i);
            i++; // инкрементировать переменную цикла.
        }
    }
}

// Если в цикле for нет условия, то цикл становится бесконечным.