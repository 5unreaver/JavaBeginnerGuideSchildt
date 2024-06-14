// Ноль в числителе с укороченным И
class SCops_2 {
    public static void main(String[] args) {
        int n, d;

        n = 10; d = 0;
        if(n != 0 && (d % n) == 0)
            System.out.println(d + " явл-ся делителем " + n);

        if (n != 0 & (d % n) == 0)
            System.out.println(d + " явл-ся делителем " + n);
    }
}