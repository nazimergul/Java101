import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        double harmonicResult = 0.0;
        for(double i = 1; i<=num ; i++){
        harmonicResult += 1/i;
        }
        System.out.println("Harmonic series: " + harmonicResult);
    }
}
