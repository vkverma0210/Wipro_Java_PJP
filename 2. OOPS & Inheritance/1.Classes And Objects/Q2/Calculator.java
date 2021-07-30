
public class Calculator {
    public static int powerInt(int num1, int num2) {
        int res = 1;
        for (int i = 0; i < num2; i++) {
            res *= num1;
        }
        return res;
    }

    public static double powerDouble(Double num1, Double num2) {
        double res = 1;
        res = Math.pow(num1, num2);
        return res;
    }
}
