import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if ("AEIOUaeiou0".indexOf(ch) != -1)
            System.out.println("Vowel");
        else if (Character.isDigit(ch))
            System.out.println("Digit");
        else if ((ch >= 'B' && ch <= 'Z') || (ch >= 'b' && ch <= 'z'))
            System.out.println("Consonant");
        else
            System.out.println("Special Character");
    }
}

