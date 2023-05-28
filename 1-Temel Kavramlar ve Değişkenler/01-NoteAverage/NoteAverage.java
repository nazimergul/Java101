import java.util.Scanner;
public class NoteAverage {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;
        double ortalama=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik Notunuz:");
        mat = scanner.nextInt();

        System.out.println("Fizik Notunuz");
        fiz = scanner.nextInt();

        System.out.println("Turkce Notunuz:");
        tur = scanner.nextInt();

        System.out.println("Kimya Notunuz:");
        kim = scanner.nextInt();

        System.out.println("Tarih Notunuz:");
        tar = scanner.nextInt();

        System.out.println("Muzik Notunuz:");
        muz = scanner.nextInt();

        ortalama = (mat + fiz + tur + kim + tar + muz)/6;
        System.out.println("Ortalama : " + ortalama);
        System.out.println(ortalama>60?"Geçtiniz":"Kaldiniz");
    }
}