import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
        else
            System.out.println("Not a letter");
    }
}

