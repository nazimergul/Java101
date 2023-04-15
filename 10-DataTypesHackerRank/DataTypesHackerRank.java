import java.util.Scanner;
public class DataTypesHackerRank {
    public static void main(String[] args){
        long number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        number = input.nextLong();

        System.out.println(number + " can be fitted in:");
        if((Math.pow(2,8)/-2)<=number && number< (Math.pow(2,8)/2)){
            System.out.println("byte");
            System.out.println("short");
            System.out.println("int");
            System.out.println("long");
        }else if((Math.pow(2,16)/-2)<=number && number< (Math.pow(2,16)/2)){
            System.out.println("short");
            System.out.println("int");
            System.out.println("long");
        }else if((Math.pow(2,32)/-2)<=number && number< (Math.pow(2,32)/2)){
            System.out.println("int");
            System.out.println("long");
        }else{
            System.out.println("long");
        }
    }
}