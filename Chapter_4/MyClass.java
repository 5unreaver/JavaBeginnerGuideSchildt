package Chapter_4;

public class MyClass {
    int x;

    /* стр. 149: 
    MyClass() { // конструктор MyClass
        x = 10;
    }
    */
    // стр. 150
    MyClass(int i) { // этот конструктор имеет параметр
        x = i;
    }
}

/* стр. 149: 
class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}
*/

class ParmConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
