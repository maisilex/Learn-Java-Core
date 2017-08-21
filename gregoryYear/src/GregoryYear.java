/**
 * Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года)
 * до заданного года включительно. На самом деле Григорианский календарь был введен значительно позже,
 * но здесь для упрощения мы распространяем его действие на всю нашу эру.
 */

public class GregoryYear {
    public static void main(String[] args) {
        System.out.println(leapYearCount(1));
        System.out.println(leapYearCount(4));
        System.out.println(leapYearCount(100));

    }

    public static int leapYearCount(int year) {
        return year/4 - year/100 + year/400;
    }
}
