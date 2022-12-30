import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Degiskenlerin Olusturulmasi
        int yariCap;
        double cemberAlan, cemberCevre, aci,dilimAlan;
        //Veri Girisi Icin Ortamin Hazirlanmasi
        Scanner input = new Scanner(System.in);
        System.out.print("Yaricapi Giriniz : ");
        yariCap = input.nextInt();
        //Hesaplamalarin Yapilmasi
        cemberAlan = Math.PI * Math.pow(yariCap, 2);
        cemberCevre = 2 * (Math.PI * yariCap);
        aci = 360/yariCap;
        dilimAlan = (Math.PI*Math.pow(yariCap,2)*aci)/360;
        //Ciktilarin Ekrana Yazdirilmasi
        System.out.println("Cemberin Alani : " + cemberAlan);
        System.out.println("Cemberin Cevresi : " + cemberCevre);
        System.out.println(aci +" derecelik daire diliminin alani : "+ dilimAlan);

    }
}