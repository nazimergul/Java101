import java.util.Scanner;

public class Mod3And4 {
    public static void main(String[] args) {
        int intNumber,bufferNumber,counterNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        intNumber = input.nextInt();
        bufferNumber = 0;
        counterNumber = 0;
        for (int i = 0; i <= intNumber; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i != 0) {
                
                bufferNumber += i;
                counterNumber +=1;
            }
        }
        System.out.println("Avarage: "+bufferNumber/counterNumber);
    }
}