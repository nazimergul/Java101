import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    int loopNum = num;
    int loopNumAux = 0;
    int i = 1;
    while (loopNum != 0) {
      loopNumAux = loopNum % (10);
      loopNum = (loopNum - loopNumAux) / 10;
      System.out.println("Decimal place: " + loopNumAux);
      i += 1;
    }
    int decPl = i - 1;
    System.out.println("Total decimal places: " + decPl);
    loopNum = num;
    loopNumAux = 0;
    int armstrongNum = 0;
    while (loopNum != 0) {
      loopNumAux = loopNum % (10);
      loopNum = (loopNum - loopNumAux) / 10;
      int subNum = 1;
      for (int ii = 1; ii <= decPl; ii++) {
        subNum = subNum * loopNumAux;
      }
      armstrongNum += subNum;
      if (loopNum != 0) {
        System.out.print(subNum + " + ");
      } else {
        System.out.println(subNum);
      }
    }
    System.out.println("Armstrong num: " + armstrongNum);
    if (armstrongNum == num) {
      System.out.println(num + ": This number is a armstrong number");
    } else {
      System.out.println(num + ": This number is not a armstrong number");
    }
  }
}
