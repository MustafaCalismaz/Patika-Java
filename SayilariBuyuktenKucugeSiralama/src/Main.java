import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, number3;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz : ");
        number1 = input.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        number2 = input.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        number3 = input.nextInt();

        //BUYUKTEN KUCUGE

        if ((number1 > number2) && (number1 > number3)) {
            if (number2 > number3) {
                System.out.println(number1 + " > " + number2 + " > " + number3);
            } else {
                System.out.println(number1 + " > " + number3 + " > " + number2);
            }
        } else if ((number2 > number1) && (number2 > number3)) {
            if (number1 > number3) {
                System.out.println(number2 + " > " + number1 + " > " + number3);
            } else {
                System.out.println(number1 + " > " + number3 + " > " + number1);
            }

        } else if ((number3 > number2) && (number3 > number1)) {
            if (number2 > number1) {
                System.out.println(number3 + " > " + number2 + " > " + number1);
            } else {
                System.out.println(number3 + " > " + number1 + " > " + number2);
            }
        }

        //KUCUKTEN BUYUGE

        if (!(number1 > number2) && !(number1 > number3)) {
            if (!(number2 > number3)) {
                System.out.println(number1 + " < " + number2 + " < " + number3);
            } else {
                System.out.println(number1 + " < " + number3 + " < " + number2);
            }
        } else if (!(number2 > number1) && !(number2 > number3)) {
            if (!(number1 > number3)) {
                System.out.println(number2 + " < " + number1 + " < " + number3);
            } else {
                System.out.println(number1 + " < " + number3 + " < " + number1);
            }

        } else if (!(number3 > number2) && !(number3 > number1)) {
            if (!(number2 > number1)) {
                System.out.println(number3 + " < " + number2 + " < " + number1);
            } else {
                System.out.println(number3 + " < " + number1 + " < " + number2);
            }
        }
    }
}