import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutKilogramFiyat = 2.14, elmaKilogramFiyat = 3.67, domatesKilogramFiyat = 1.11, muzKilogramFiyat = 0.95, patlicanKilogramFiyat = 5.00, armutKilogram, elmaKilogram, domatesKilogram, muzKilogram, patlicanKilogram, toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kac Kilo ? ");
        armutKilogram = input.nextDouble();
        System.out.print("Elma Kac Kilo ? ");
        elmaKilogram = input.nextDouble();
        System.out.print("Domates Kac Kilo ? ");
        domatesKilogram = input.nextDouble();
        System.out.print("Muz Kac Kilo ? ");
        muzKilogram = input.nextDouble();
        System.out.print("Patlican Kac Kilo ? ");
        patlicanKilogram = input.nextDouble();

        toplam = (armutKilogram * armutKilogramFiyat) + (elmaKilogramFiyat * elmaKilogram) + (domatesKilogramFiyat * domatesKilogram) + (muzKilogramFiyat * muzKilogram) + (patlicanKilogramFiyat * patlicanKilogram);
        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}