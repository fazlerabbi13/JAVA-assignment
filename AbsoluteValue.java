import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num < 0 ? -num : num);
    }
}

