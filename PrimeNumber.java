import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not a prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Its prime number");
        else
            System.out.println("not aprime number");
    }
}
