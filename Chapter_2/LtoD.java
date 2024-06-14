// Демонстрация автоматического преобразования типа long в тип double
class LtoD {
    public static void main(String[] args) {
        long L = 100123285L;
        double D = L; // Автоматическое преобразования типа long в тип double
        System.out.println("L и D: " + L + " " + D);

        D = 100123285.0;
        L = D; // не пройдёт компиляцию
        System.out.println("L и D: " + L + " " + D);
    }
}