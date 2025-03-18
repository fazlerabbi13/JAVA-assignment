import java.util.Scanner;

public class MinMaxDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
       
        System.out.println("Largest: " + Math.max(num1,num2));
        System.out.println("Smallest: " + Math.min(num1,num2));
    }
}

