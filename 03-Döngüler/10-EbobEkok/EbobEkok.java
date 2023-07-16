import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        int num1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int num2 = input.nextInt();
        
        // Calculate Ebob
        int ebob = 0;
        int i = Math.min(num1, num2);
        while (i > 0) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }

        System.out.println("Ebob: " + ebob);

        // Calculate Ekok
        int ekok = num1 * num2 / ebob;
        System.out.println("Ekok: " + ekok);
    }
}