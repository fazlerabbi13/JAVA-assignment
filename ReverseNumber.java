import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rev = (num % 10) * 100 + ((num / 10) % 10) * 10 + (num / 100);
        System.out.println(rev);
    }
}

