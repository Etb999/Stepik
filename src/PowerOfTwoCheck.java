public class PowerOfTwoCheck {
    public static boolean isPowerOfTwo(int value) {

        return (Integer.bitCount(Math.abs(value)) == 1);
    }
}
