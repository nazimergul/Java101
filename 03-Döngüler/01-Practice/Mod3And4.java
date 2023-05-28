import java.util.Scanner;

public class Mod3And4 {
    public static void main(String[] args) {
        int intNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        intNumber = input.nextInt();

        for (int i = 0; i <= intNumber; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}