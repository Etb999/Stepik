public class DoubleCompare {

    public static boolean doubleExpression(double a, double b, double c) {
        boolean anwser;

        anwser = Math.abs((a+b)-c) < 0.0001;
        return anwser;
    }
}
