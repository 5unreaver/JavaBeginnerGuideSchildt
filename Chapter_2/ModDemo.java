// Демонстрация использ-ия операции % 
class ModDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10/3;
        irem = 10%3;

        dresult = 10./3.;
        drem = 10.%3.;

        System.out.println("Рез-т и остаток от деления 10/3: " + iresult +
        " & " + irem);
        System.out.println("Рез-т и остаток от деления 10./3.: " + dresult +
        " & " + drem);
    }
    
}
