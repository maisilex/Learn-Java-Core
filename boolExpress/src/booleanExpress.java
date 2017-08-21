/**
 * Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
 * Во всех остальных случаях метод должен возвращать false.
 */

public class booleanExpress {
    public static void main(String[] args) {
        System.out.println(booleanExpression(true, true, true, true));

    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        //return a & b & c & d;
        //return (a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0) + (d ? 1 : 0) == 2;

        return (a | b | c | d) && !(a & b & c & d) && !(a ^ b ^ c ^ d);
    }

}