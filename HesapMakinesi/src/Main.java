import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2;
        int process;


        Scanner input = new Scanner(System.in);

        System.out.print("Ilk sayinizi giriniz : ");
        number1 = input.nextDouble();
        System.out.print("Ikinci sayinizi giriniz : ");
        number2 = input.nextDouble();
        System.out.print("Yapmak istediginiz islem?\n");
        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n");
        process = input.nextInt();

        switch (process) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                System.out.println(number1 / number2);
            default:
                System.out.println("Eksik ya da hatali tusladiniz :)");
        }
    }
}