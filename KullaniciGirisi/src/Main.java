import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, checkUserName, checkPassword, passwordReset, newPassword;
        checkUserName = "admin";
        checkPassword = "1234";

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici adinizi giriniz : ");
        userName = input.next();
        System.out.print("Sifrenizi giriniz : ");
        password = input.next();

        if (userName.equals(checkUserName)) {
            if (password.equals(checkPassword)) {
                System.out.println("hosgeldiniz :)");
            } else {
                System.out.println("Sifreniz yanlis, sifirlamak istiyor musunuz?(Istiyorsaniz 'y', istemiyorsaniz 'n')");
                passwordReset = input.next();
                if (passwordReset.equals("y")) {
                    System.out.print("Lutfen yeni sifrenizi giriniz : ");
                    newPassword = input.next();
                    if (newPassword.equals(password)) {
                        System.out.println("Sifre olusturlamadi, Lutfen baska sifre giriniz.");ad
                    } else {
                        password = newPassword;
                        System.out.println("Sifre olusturuldu");
                    }

                } else if (passwordReset.equals("n")) {
                    System.out.println("Sifreniz degistirilmedi");
                }else {
                    System.out.println("Hatali tusladiniz");
                }
            }
        } else {
            System.out.println("Kullanici adiniz yanlis");
        }
    }
}