import java.util.Scanner;

public class WaitOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, addEvenNumbers = 0;

        do {
            System.out.print("Enter a number: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                addEvenNumbers += n;
            }
        } while (n % 2 == 0);
        System.out.println(addEvenNumbers);
    }
}
