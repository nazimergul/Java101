import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double price,kdvRatio = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price : ");
        price = input.nextDouble();

        double kdvPrice = price * kdvRatio;
        double priceWithKdv = kdvPrice + price;

        System.out.println("Price : " + price);
        System.out.println("KDV Ratio : " + kdvRatio);
        System.out.println("KDV Price : " + kdvPrice);
        System.out.println("Price With KDV : " + priceWithKdv);

    }
}