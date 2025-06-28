package Question_100_coding_challenge;

public class Code_101_challenge {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        // equals() is case-sensitive
        boolean isEqual = string1.equals(string2); // false

        // equalsIgnoreCase() ignores case
        boolean isEqualIgnoreCase = string1.equalsIgnoreCase(string2); // true

        // compareTo() is case-sensitive and returns ASCII difference
        int compareResult = string1.compareTo(string2); // -32 (difference between 'H' and 'h')

        System.out.println("equals(): " + isEqual +
                ", equalsIgnoreCase(): " + isEqualIgnoreCase +
                ", compareTo(): " + compareResult);
    }
}

