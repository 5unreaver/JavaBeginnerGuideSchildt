/* Цикл for, выполняющийся с отрицательным приращением переменной. */
class DecrFor {
    public static void main(String[] args) {
        int x, count;

        for(x = 100; x > -100; x -= 5) // на каждой итерации переменная цикла уменьшается на 5.
            System.out.println(x);

        for(count = 10; count < 5; count++)
        x += count; // этот оператор не будет выполнен.
    }
}