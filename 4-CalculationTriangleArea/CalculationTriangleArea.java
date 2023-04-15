import java.util.Scanner;

public class CalculationTriangleArea {
    public static void main(String[] args) {
        double a, b, c, u, Field;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first edge : ");
        a = input.nextDouble();
        System.out.print("Enter second edge : ");
        b = input.nextDouble();
        System.out.print("Enter second edge : ");
        c = input.nextDouble();
        u = (a+b+c)/2;
        Field=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Triangle Field : " + Field);
    }
}