import java.util.Scanner;
public class ActivitySuggestion {
    public static void main(String[] args) {
        double temperature;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        temperature = input.nextDouble();

        if(temperature<5){
            System.out.println("Kayak yapabilirsiniz.");  
        }
        if(temperature>=5 && temperature<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if(temperature>=10 && temperature<=25){
            System.out.println("Piknik yapabilirsiniz.");
        }
        if(temperature>25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
