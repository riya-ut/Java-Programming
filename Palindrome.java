import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int orginal = n;
        int reverse = 0;

        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        if (orginal == reverse)
            System.out.println("Paliondrome");
        else
            System.out.println("Not a paliondrome");

    }

}