import java.util.Scanner;
public class TaxiMeter {
    public static void main(String[] args){
        int startPrice = 10, minPrice=20;
        double priceOfKm = 2.2, distance , totalPrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance(km) : ");
        distance=input.nextDouble();
        totalPrice = (startPrice + (priceOfKm * distance))<minPrice?minPrice:(startPrice + (priceOfKm * distance));
        System.out.println("Total Price : " + totalPrice);
    }
}