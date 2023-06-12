import java.util.Scanner;

public class PowerOf4and5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int exponent = 0;
        //Using with for loop
        for (int i = 1, ii = 1; i <= n || ii < n; i *= 4, ii *= 5) {
            if (i <= n) {
                System.out.println("4 to the power of " + exponent + " = " + i);
            }
            if (ii <= n) {
                System.out.println("5 to the power of " + exponent + " = " + ii);
            }
            exponent += 1;
        }
        //Using with while loop
        // exponent = 0;
        // int powerOf4 = 1, powerOf5 = 1;
        // while (powerOf4 <= n || powerOf5 <= n) {
        //     if (powerOf4 < n) {
        //         System.out.println("4 to the power of " + exponent + " = " + powerOf4);
        //     }
        //     powerOf4 *= 4;
        //     if (powerOf4 < n) {
        //         System.out.println("5 to the power of " + exponent + " = " + powerOf5);
        //     }
        //     powerOf5 *= 5;
        //     exponent += 1;
        // }
    }
}
