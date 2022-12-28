import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi
        int matematik,fizik,kimya,turkce,tarih,muzik;

        //Scanner sinifi olusuturluyor

        Scanner input = new Scanner(System.in);

        //Degiskenlerin kullanicidan alinmasi
        System.out.print("Matematik : ");
        matematik = input.nextInt();

        System.out.print("Fizik : ");
        fizik = input.nextInt();

        System.out.print("Kimya : ");
        kimya = input.nextInt();

        System.out.print("Turkce : ");
        turkce = input.nextInt();

        System.out.print("Tarih : ");
        tarih = input.nextInt();

        System.out.print("Muzik : ");
        muzik = input.nextInt();


        //Verilenrin islenmesi
        int toplam = matematik+fizik+kimya+turkce+tarih+muzik;

        double ortalama = toplam / 6;

        boolean gecmeDurumu = ortalama >= 60;

        String basariDurumu = (gecmeDurumu) ? "Tebrikler "+ ortalama +" ortalama ile gectiniz" : "Malesef "+ ortalama + " ortalama ile kaldiniz";

        System.out.println(basariDurumu);

    }
}