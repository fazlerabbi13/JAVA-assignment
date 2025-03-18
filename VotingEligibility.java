import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println(age >= 18 ? "Eligible to vote" : "Not eligible");
        scan.close();
    }
}
