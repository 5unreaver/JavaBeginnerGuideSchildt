package Chapter_5;
// применение метода substring()
public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель Интернета.";

        // сформировать подстроку
        String substr = orgstr.substring(7, 25); // счёт начинается в нуля
        // НО почему на 25 он не выдаёт "ИнтернетА"?

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
