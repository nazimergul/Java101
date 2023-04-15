import java.util.Scanner;
public class FruitsTotalPrice {
    public static void main(String[] args){
        double pear=2.14, apple=3.67, tomato=1.11, banana=0.95, eggplant=5;
        Scanner input = new Scanner(System.in);

        System.out.print("How many kilograms of pear? : ");
        pear *= input.nextDouble();

        System.out.print(" How many kilograms of apple? : ");
        apple *= input.nextDouble();

        System.out.print("How many kilograms of tomato? : ");
        tomato *= input.nextDouble();

        System.out.print(" How many kilograms of banana? : ");
        banana *= input.nextDouble();
        
        System.out.print(" How many kilograms of eggplant? : ");
        eggplant *= input.nextDouble();
        
        System.out.println(pear + apple + tomato + banana + eggplant);
    }
}