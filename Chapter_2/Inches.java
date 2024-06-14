/*
 * Расчёт числа кубических дюймов в кубе объёмом в 1 куб. милю.
 * 1 миля (mile) = 8 фурлонгов (furlong)
 *  = 1760 ярдов (yard)
 *  = 5280 футов (foot)
 *  = 1609,344 метров.
 */
class Inches {
    public static void main(String[] args) {
        long ci, im;

        im = 5280 * 12; // in miles? сколько дюймов в миле.
        ci = im * im * im; // cube inches.

        System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов.");
    }
}