package Chapter_5;
// демонстрация использования массивов строк
public class StringArrays {
    public static void main(String[] args) {
        String strs[] = { "Эта", "строка", "является", "тестом." };

        System.out.println("Исходный массив: ");
        for(String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");

        // Изменить строку
        strs[2] = "также является";
        strs[3] = "тестом!";

        System.out.println("Изменённый массив: ");
        for(String s : strs)
            System.out.print(s + " ");
    }
}