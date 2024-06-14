class Page93 {
    public static void main(String[] args) {
        int i = 10,
        j = 19,
        k = 101,
        b = 1,
        d = 2,
        c = 2,
        a;

        if(i == 10) {
            if(j < 20) a = b;
            if(k > 100) c = d;
            else a = c; // этот оператор относится к оператору if(k > 100).
            }
        
        else a = d; // а этот оператор относится к if(i == 10).
    }
}