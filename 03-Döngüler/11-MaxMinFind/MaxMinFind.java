import java.util.Scanner;
public class MaxMinFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int nums = input.nextInt();
        int countNums = 1;
        int minNum = 0;
        int maxNum = 0;
        while (nums > 0){
            System.out.print(countNums + ". Sayıyı giriniz: ");
            int inputNum = input.nextInt();
            if(countNums > 1){
                if(inputNum<minNum){
                    minNum=inputNum;
                }
                if(inputNum>maxNum){
                    maxNum=inputNum;
                }
            }else{
                minNum = maxNum = inputNum;
            }
            countNums++;
            nums--;
        }
        System.out.println("En büyük sayı: " + maxNum);
        System.out.println("En küçük sayı: " + minNum );
    }
}
