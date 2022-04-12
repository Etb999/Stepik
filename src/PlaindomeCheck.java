public class PlaindomeCheck {
    public static boolean isPalindrome(String text) {
        String inputString, a, b;
        inputString = text.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb = new StringBuilder(inputString);

        a = sb.toString();
        b = sb.reverse().toString();

        return a.equalsIgnoreCase(b);
    }
}
