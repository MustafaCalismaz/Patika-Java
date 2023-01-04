import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, lessons = 0, total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        matematik = input.nextInt();
        if (!(matematik < 0) && !(matematik > 100)) {
            total += matematik;
            lessons++;
        }

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        if (!(fizik < 0) && !(fizik > 100)) {
            total += fizik;
            lessons++;
        }
        System.out.print("Turkce Notunuz : ");
        turkce = input.nextInt();
        if (!(turkce < 0) && !(turkce > 100)) {
            total +=turkce;
            lessons++;
        }
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        if (!(kimya < 0) && !(kimya > 100)) {
            total +=kimya;
            lessons++;
        }
        System.out.print("Muzik Notunuz : ");
        muzik = input.nextInt();
        if (!(muzik < 0) && !(muzik > 100)) {
            total +=muzik;
            lessons++;
        }

        average = total / lessons;

        if (average >= 55) {
            System.out.println("Tebrikler " + average + " ortalama ile sinifi gectiniz.");
        } else if (average < 55) {
            System.out.println("Ne yazik ki " + average + " ortalama ile kaldiniz");
        }
    }
}