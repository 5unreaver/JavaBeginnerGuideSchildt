/* В этой программе предприним-ся попытка объявить во внутр. обл.
действия переменную с таким же именем, как и у переменной,
объявленной во внешней области действия.*/
class NestVar {
    public static void main(String[] args) {
        int count;
        for(count = 0; count < 10; count = count+1) {
            System.out.println("Значение count: " + count);

            /*int count; // Недопустимо!
                for(count = 0; count<2; count++)
                    System.out.println("В этой программе есть ошибка!");*/
            // В C & C++ такой вариант возможен, в Java - нет. Недопустимо сокрытие имён переменных.
        }
    }
}