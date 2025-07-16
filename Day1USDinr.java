import java.util.Scanner;

public class Day1USDinr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount in USD");
        int dollar = scan.nextInt();
        float inr = dollar * 85.99f;

        System.out.println(inr + " In Rupees");

    }

}
