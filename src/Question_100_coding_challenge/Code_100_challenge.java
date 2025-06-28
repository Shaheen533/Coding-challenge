package Question_100_coding_challenge;
import java.util.Scanner;
public class Code_100_challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Input from user

        int length = input.length();
        char firstChar = input.charAt(0);

        String substring = "";
        int worldIndex = input.indexOf("World");

        if (worldIndex != -1) {
            substring = input.substring(worldIndex); // safe substring
        } else {
            substring = "Not found";
        }

        System.out.println("Length: " + length + ", First char: " + firstChar + ", Substring: " + substring);
    }
}


