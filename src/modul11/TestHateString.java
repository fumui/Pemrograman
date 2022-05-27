package modul11;

public class TestHateString {
    public static void main(String args[]) {
        String input = "invalid input";
        try {
            if (input.equals("invalid input")) {
                throw new HateStringException();
            }
            System.out.println("String accepted.");
        } catch (HateStringException e) {
            System.out.println("I hate this string: " + input +".");
        }
    }
}
