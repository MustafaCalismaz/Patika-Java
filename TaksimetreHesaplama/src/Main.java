import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int baslangicFiyat = 10;
        double kilometre, ucret, total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi giriniz : ");
        kilometre = input.nextDouble();

        for (double i = 0; i <= kilometre; i++) {
                ucret =+ i * 2.20;
                total = ucret;
        }
        total += baslangicFiyat;
        System.out.println((total < 20) ? total =  20 : total );


    }
}