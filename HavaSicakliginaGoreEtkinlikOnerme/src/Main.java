import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Hava sicakligini giriniz (Santigrat(C) seklinde) : ");
        heat = input.nextInt();

        if (heat >= 25) {
            System.out.println("Yuzmek icin guzel bir gun. Yuzme en dogru karar ;)");
        } else if (15 <= heat && heat < 25) {
            System.out.println("Havada mangal kokusu aliyorum. Piknik iyi bir secim olacaktir :)");
        } else if (5 <= heat && heat < 15) {
            System.out.println("Beyaz perdenin enfes isiklari gozumu alirken, patlamis misirin kokusunu alabiliyorum.Sinema iyi bir tercih olacaktir.");
        } else if (5 > heat) {
            System.out.println("Takimlari Cikarmamin tam zamani. Kayak yapmak icin enfes bir hava");
        }

        boolean a = heat >= 25;
        boolean b = 15 <= heat && heat < 25;
        boolean c = 5 <= heat && heat < 15;
        boolean d = 5 > heat;
        System.out.println(a ? "Yuzmek icin guzel bir gun. Yuzme en dogru karar ;)" : b ? "Havada mangal kokusu aliyorum. Piknik iyi bir secim olacaktir :)" : c ? "Beyaz perdenin enfes isiklari gozumu alirken, patlamis misirin kokusunu alabiliyorum.Sinema iyi bir tercih olacaktir." : d ? "Takimlari Cikarmamin tam zamani. Kayak yapmak icin enfes bir hava" : "");
    }
}