import java.util.Scanner;

public class ZodiacSignFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Month of Birth: ");
        int Month = input.nextInt();

        String zodiacSign = "";

        if (Month > 12 || Month < 1) {
            zodiacSign = "Month is wrong";
        } else {
            System.out.print("Date of Birth: ");
            int Date = input.nextInt();

            if (Month == 1) {
                if (Date > 31 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 22) ? "Oğlak" : "Kova";
                }
            }
            if (Month == 2) {
                if (Date > 29 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 20) ? "Kova" : "Balık";
                }
            }
            if (Month == 3) {
                if (Date > 31 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 21) ? "Balık" : "Koç";
                }
            }
            if (Month == 4) {
                if (Date > 30 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 21) ? "Koç" : "Boğa";
                }
            }
            if (Month == 5) {
                if (Date > 31 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 22) ? "Boğa" : "İkizler";
                }
            }
            if (Month == 6) {
                if (Date > 30 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 23) ? "İkizler" : "Yengeç";
                }
            }
            if (Month == 7) {
                if (Date > 31 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 23) ? "Yengeç" : "Aslan";
                }
            }
            if (Month == 8) {
                if (Date > 31 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 23) ? "Aslan " : "Başak";
                }
            }
            if (Month == 9) {
                if (Date > 30 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 23) ? "Başak" : "Terazi";
                }
            }
            if (Month == 10) {
                if (Date > 31 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 23) ? "Terazi" : "Akrep";
                }
            }
            if (Month == 11) {
                if (Date > 30 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 22) ? "Akrep" : "Yay";
                }
            }
            if (Month == 12) {
                if (Date > 31 || Date < 1) {
                    zodiacSign = "Date is wrong";
                } else {
                    zodiacSign = (Date < 22) ? "Yay" : "Oğlak";
                }
            }
        }
        System.out.println(zodiacSign);
    }
}
