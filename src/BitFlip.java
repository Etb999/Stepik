public class BitFlip {
    public static int flipBit(int value, int bitIndex) {
        int i = 1;
        int anwser = i << bitIndex-1;
        anwser = value ^ anwser;
        return anwser;
    }
}
