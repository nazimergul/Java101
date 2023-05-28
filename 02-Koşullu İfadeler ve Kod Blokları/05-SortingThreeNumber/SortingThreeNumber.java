import java.util.Scanner;
public class SortingThreeNumber {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("Number 1: ");
        a = input.nextInt();

        System.out.print("Number 2: ");
        b = input.nextInt();

        System.out.print("Number 3: ");
        c = input.nextInt();

        int [] Numbers = new int[3];
        Numbers[0] = a;
        Numbers[1] = b;
        Numbers[2] = c;

        for(int i= 0 ; i<3 ; i++){
            for(int ii=0 ; ii<3 ; ii++){
              if(Numbers[ii] > Numbers[i]){
                int AUX = Numbers[i];
                Numbers[i] = Numbers [ii];
                Numbers [ii] = AUX;
              }
            }            
        }
        System.out.println("Sort: " + Numbers[0]+ " < " + Numbers[1]+ " < " + Numbers[2]);      
    }
}
