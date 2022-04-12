import java.math.BigInteger;

public class Factroial {

    public static BigInteger factorial(int value) {
        BigInteger anwser = BigInteger.ONE;

        if (value == 1){
            return anwser;
        }
        for(int i = 1; i < value+1; i++){
            anwser = anwser.multiply(BigInteger.valueOf(i));
        }
        return anwser;
    }
}
