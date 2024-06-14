// Стр. 88, вопрос 11

class Ch2_Page88_Ex11 {
    public static void main(String[] args) {

        for(int i = 2; i <= 100; i++) {         
            if(( i % 10 == 0) & i != 100) System.out.println(i + ",\t "); /* ранее было на строке ниже,
            в итоге до десятых выводились значения с плавающей точкой */   
            else if(i != 100) System.out.print(i + ",\t ");
            else System.out.print(i + ".");
        }
    }
}
