import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kilo;
        double boy,vucutKitleIndeksi;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz : ");
        boy =input.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = input.nextInt();

        vucutKitleIndeksi = kilo / Math.pow(boy,2);
        System.out.println("Vucut Kitle Indeksiniz : "+ vucutKitleIndeksi);



    }
}