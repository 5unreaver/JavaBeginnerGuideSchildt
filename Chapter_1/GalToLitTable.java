/*
 * Упражнение 1.2
 * 
 * Это программа отображает таблицу перевода галлонов в литры.
 * 
 * Присвойте файлу с исходным кодом имя GalToLittable.java.
 */
class GalToLitTable {
    public static void main(String[] args) {
        double Gallons, Liters;
        int counter;

        counter = 0;
        for(Gallons = 1; Gallons <= 30; Gallons++) {
            Liters = Gallons * 3.7854; // преобразовать в литры
            System.out.println(Gallons + " галлонам соответствует " + Liters + " литров.");
            counter++;
            if(counter == 10) {
                System.out.println();
                counter = 0; // сбросить счётчик строк
            }
        }
    }
}
