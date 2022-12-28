import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // b => 1. dik kenar
        // c => 2. dik kenar
        // d => uzun kenar
        // a => alan

        double dikKenar1, dikKenar2, uzunKenar, ucgeninAlani, ucgeninCevresi;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Dik kenar uzunlugunu giriniz : ");
        dikKenar1 = input.nextDouble();
        System.out.print("2. Dik kenar uzunlugunu giriniz : ");
        dikKenar2 = input.nextDouble();

        uzunKenar = Math.sqrt(Math.pow(dikKenar1, 2) + Math.pow(dikKenar2, 2));
        ucgeninCevresi = dikKenar1 + dikKenar2 + uzunKenar;
        ucgeninAlani = (dikKenar1*dikKenar2)/2;
        System.out.println(ucgeninAlani);
        System.out.println("Uzun kenar "+ucgeninCevresi);


    }
}