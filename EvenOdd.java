
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if((num & 1) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
