package Chapter_4;

class ReturnFromVoid {
    void myMeth() {
        int i;
        for(i = 0; i < 10; i++) {
            if(i == 5) return; // завершить цикл на значении 5
            System.out.println();
        }
    }
}
