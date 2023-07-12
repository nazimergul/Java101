import java.util.Scanner;

public class TriangleFromStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int maxStarNum = 1 + 2 * (num - 1);
        int refPoint = (maxStarNum + 1) / 2;
        for (int step = 1; step <= num+1; step++) {
            for (int i = 1; i <= maxStarNum; i++) {
                if (i <= (refPoint-step+1) || i>=(refPoint+step-1)) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

    }
}
