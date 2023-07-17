public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrimeNumber;
        for (int i = 2; i <= 100; i++) {
            isPrimeNumber = true;
            for (int ii = 2; ii < i; ii++) {
                if (i % ii == 0) {
                    isPrimeNumber = false;
                }
            }
            if (isPrimeNumber) {
                System.out.print(i + " ");
            }
        }
    }
}
