import java.util.Scanner;

public class TriangleAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        System.out.println(a + b + c == 180 ? "Valid Triangle" : "Invalid Triangle");
    }
}

