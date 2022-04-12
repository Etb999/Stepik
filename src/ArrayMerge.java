public class ArrayMerge {

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int anwserArrayLength = a1.length + a2.length;
        int[] anwserArray = new int[anwserArrayLength];

        for (int i = 0; i < a1.length; i++){
            anwserArray[i] = a1[i];
        }
        for (int i = a1.length; i < anwserArrayLength; i++){
            anwserArray[i] = a2[i-a1.length];
        }
        for (int i = 0; i < anwserArrayLength-1; i++) {
            for (int j = 1; j < anwserArrayLength; j++) {
                if (anwserArray[j] < anwserArray[j-1]) {
                    int buffer;
                    buffer = anwserArray[j-1];
                    anwserArray[j-1] = anwserArray[j];
                    anwserArray[j] = buffer;
                }
            }
        }
        return anwserArray;
    }
}
