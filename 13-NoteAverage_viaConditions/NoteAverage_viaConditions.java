import java.util.Scanner;
public class NoteAverage_viaConditions {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;
        double ortalama=0;
        int counter=0;
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

        if(mat>=0 && mat<=100){
            ortalama += mat;
            counter += 1;
        }

        if(fiz>=0 && fiz<=100){
            ortalama += fiz;
            counter += 1;
        }

        if(tur>=0 && tur<=100){
            ortalama += tur;
            counter += 1;
        }

        if(kim>=0 && kim<=100){
            ortalama += kim;
            counter += 1;
        }

        if(tar>=0 && tar<=100){
            ortalama += tar;
            counter += 1;
        }

        if(muz>=0 && muz<=100){
            ortalama += muz;
            counter += 1;
        }

        ortalama = ortalama/counter;

        if(ortalama<=55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        }else{
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız: "+ortalama);
        System.out.println("Geçerli not sayısı: "+ counter + "\nGeçersiz not sayısı: "+ (6-counter));
    }
}
