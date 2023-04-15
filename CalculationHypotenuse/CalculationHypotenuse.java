import java.util.Scanner;

public class CalculationHypotenuse {
    public static void main(String[] args) {
        double a, b, hyp;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first edge : ");
        a = input.nextDouble();
        System.out.print("Enter second edge : ");
        b = input.nextDouble();
        hyp = Math.sqrt((a * a) + (b * b));
        System.out.print("Hypotenuse : " + hyp);
    }
}