import java.util.Scanner;

public class Day1Add3num {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); // input
        int b = scan.nextInt(); // input
        int c = scan.nextInt(); // input

        int sum1 = a + b; // logic
        System.out.println(sum1); // output

        int sum2 = a + c; // logic
        System.out.println(sum2); // output

        int sum3 = b + c; // logic
        System.out.println(sum3); // output
    }

}
