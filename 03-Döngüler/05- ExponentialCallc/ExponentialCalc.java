import java.util.Scanner;

public class ExponentialCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();

        int result = 1;
        for (int i = 1; i<=exponent ; i++) {
            result *= n;
        }
        System.out.println("Result: " + result);
    }
}
