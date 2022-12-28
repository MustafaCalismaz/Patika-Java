import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //BENIM YAPTIGIM
        /*int fiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat giriniz : ");
        fiyat = input.nextInt();

        if (fiyat<=1000 && fiyat>0) {
            double kdv = ((fiyat * 18) / 100)+fiyat;
            System.out.println("Kdv'li tutar : "+ kdv);
        }else if(fiyat>1000){
            double kdv = ((fiyat * 8) / 100)+fiyat;
            System.out.println("Kdv'li tutar : "+kdv);*/

        //HOCANIN YAPTIGI

        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutuarini Giriniz : ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Orani : " + kdvOran);
        System.out.println("KDV Tutari : " + kdvTutar);
        System.out.println("KDV'li Tutari : " + kdvliTutar);

        /*IKI KOD ARASINDA KI FARKLAR
        * isimlendirmelerim hatali
        * kodum cok karmasik, okunurlugu zor */
    }

}
