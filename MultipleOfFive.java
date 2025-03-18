import java.util.Scanner;

public class MultipleOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num % 5 == 0 ? "Multiple of 5" : "Not a multiple of 5");
        scanner.close();
    }
}

