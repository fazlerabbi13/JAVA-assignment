import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = scanner.nextDouble();
        char unit = scanner.next().charAt(0);
        if (unit == 'C' || unit == 'c')
            System.out.println("Fahrenheit: " + (temp * 9/5 + 32));
        else if (unit == 'F' || unit == 'f')
            System.out.println("Celsius: " + ((temp - 32) * 5/9));
        else
            System.out.println("Invalid unit");
    }
}

