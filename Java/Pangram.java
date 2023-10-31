package test;
import java.util.HashSet;

public class Pangram {
    public static boolean isPangram(String input) {
        input = input.replaceAll(" ", "").toLowerCase();

        HashSet<Character> alphabetSet = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'a' && c <= 'z') {
                alphabetSet.add(c);
            }
        }
        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        String input = "Two driven jocks help fax my big quiz";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
