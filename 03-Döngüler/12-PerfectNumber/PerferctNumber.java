import java.util.Scanner;

public class PerferctNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        double num = input.nextDouble();
        double addFactors = 0;
        for (double i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                addFactors += i;
            }
        }
        System.out.println("Total: " + addFactors);
        if (addFactors == num) {
            System.out.println(num + " Mükemmle sayıdır.");
        } else {
            System.out.println(num + " Mükemmle sayı değildir.");
        }
    }
}
