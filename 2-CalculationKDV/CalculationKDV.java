import java.util.Scanner;
public class CalculationKDV {
    public static void main(String[] args) {        
        double price,kdvRatio;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price : ");
        price = input.nextDouble();

        if(price<=1000){
            kdvRatio = 0.18;
        }else{
            kdvRatio = 0.08;
        }

        double kdvPrice = price * kdvRatio;
        double priceWithKdv = kdvPrice + price;

        System.out.println("Price : " + price);
        System.out.println("KDV Ratio : " + kdvRatio);
        System.out.println("KDV Price : " + kdvPrice);
        System.out.println("Price With KDV : " + priceWithKdv);

    }
}