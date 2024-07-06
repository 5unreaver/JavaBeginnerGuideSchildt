package Chapter_4;

public class ChkNum {
    // вернуть логическое значение true,
    // если x содержит чётное число
    boolean isEven(int x) {
        if((x%2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if(e.isEven(10)) System.out.println("10 - чётное число");
        // в скобках после Even - передача аргумента методу.
        if(e.isEven(9)) System.out.println("9 - чётное число");
        if(e.isEven(8)) System.out.println("8 - чётное число");
    }
}
