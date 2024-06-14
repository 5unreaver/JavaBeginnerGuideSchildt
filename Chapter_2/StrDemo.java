// Демонстрация управляющих последовательностей в символьных строках.
class StrDemo {
    public static void main(String[] args) {
        System.out.println("Первая строка\nВторая строка"); // Символ перевода строки
        System.out.println("A\tB\tC"); // Горизонтальная табуляция
        System.out.println("D\tE\tF");
        System.out.println("Бар \"Синяя устрица\"\nЧто такое \'каретка\'?");
        System.out.println("Пеликан\rКот");
        System.out.println("Пеликан\fКот");

        char dollar = '$';
        System.out.println(dollar);

        int a, b = 10, c = 19, d; // инициализируются переменные b и c.
        // ВОПРОС: почему я не могу написать int c = 19L?
        a = b + 12;
        long v = 3l; /*мы ввели переменную примитивного типа long.*/
        Long V /*создаём объект класса Long...*/= new Long(v); /*... в явном виде через оператор new.
        new - вызываем конструктор класса, который имеет аналогичное с классом название.
        (Классы всегда с большой буквы).
        Конструктор - метод класса, инициализирующий экземпляр класса
        (ты методу передаёшь примитивную переменную long, которую он присваивает переменной
        внутри объекта 'V').
        Long - класс, содерж. примитивный тип long и методы работы с ним.*/

        /* Ниже - "Синтаксический сахар", т. е. сокращение объёма кода.
         * Мы сразу взяли класс и впихнули ему переменную "q".*/

        Long q = 12l; // Взял объект класса Long и вызвал метод 'intValue', который...
        a = q.intValue(); // ... long перевёл в int.      
        // d = c + a; // The value of the local variable d is not used.
        // по итогу просто добавил в prinln все значения.
        d = a + c;
        System.out.println(a + b + c + d);
    }
}