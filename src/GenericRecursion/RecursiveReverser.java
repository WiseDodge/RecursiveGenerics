package GenericRecursion;

public class RecursiveReverser {

    public int reverse(int value) {
        String reversedString = reverseString(Integer.toString(value));
        return Integer.parseInt(reversedString);
    }

    public double reverse(double value) {
        String reversedString = reverseString(Double.toString(value));
        return Double.parseDouble(reversedString);
    }

    public String reverse(String value) {
        return reverseString(value);
    }

    private String reverseString(String reversedString) {
        if (reversedString == null || reversedString.length() <= 1) {
            return reversedString;
        }
        return reverseString(reversedString.substring(1)) + reversedString.charAt(0);
    }
}
