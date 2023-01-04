import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz Ayi giriniz(Rakam olarak) : ");
        month = input.nextInt();
        System.out.print("Dogdugunuz gunu giriniz(Rakam olarak) : ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day < 22) {
                    System.out.println("Burcunuz Oglak.");
                } else {
                    System.out.println("Burcunuz Kova");
                }
                break;
            case 2:
                if (day < 20) {
                    System.out.println("Burcunuz Kova");
                } else {
                    System.out.println("Burcunuz Balik");
                }
                break;
            case 3:
                if (day > 20) {
                    System.out.println("Burcunuz Koc");
                } else {
                    System.out.println("Burcunuz Balik");
                }
                break;
            case 4:
                if (day < 21) {
                    System.out.println("Burcunuz Koc");
                } else {
                    System.out.println("Burcunuz Boga");
                }
                break;
            case 5:
                if (day < 22) {
                    System.out.println("Burcunuz Boga");
                } else {
                    System.out.println("Burcunuz Ikizler");
                }
                break;
            case 6:
                if (day < 23) {
                    System.out.println("Burcunuz Ikizler");
                } else {
                    System.out.println("Burcunuz Yengec");
                }
                break;
            case 7:
                if (day < 23) {
                    System.out.println("Burcunuz Yengec");
                } else {
                    System.out.println("Burcunuz Aslan");
                }
            case 8:
                if (day < 23) {
                    System.out.println("Burcunuz Aslan");
                } else {
                    System.out.println("Burcunuz Basak");
                }
                break;
            case 9:
                if (day < 23) {
                    System.out.println("Burcunuz Basak");
                } else {
                    System.out.println("Burcunuz Terazi");
                }
                break;
            case 10:
                if (day < 23) {
                    System.out.println("Burcunuz Terazi");
                } else {
                    System.out.println("Burcunuz Akrep");
                }
                break;
            case 11:
                if (day < 23) {
                    System.out.println("Burcunuz Akrep");
                } else {
                    System.out.println("Burcunuz Yay");
                }
                break;
            case 12:
                if (day < 22) {
                    System.out.println("Burcunuz Yay");
                } else {
                    System.out.println("Burcunuz Oglak");
                }
                break;
            default:
                System.out.println("Yanlis bir deger girdiniz");
        }
        if (month == 1) {
            if (day < 22) {
                System.out.println("Burcunuz Oglak.");
            } else {
                System.out.println("Burcunuz Kova");
            }
        } else if (month == 2) {
            if (day < 20) {
                System.out.println("Burcunuz Kova");
            } else {
                System.out.println("Burcunuz Balik");
            }

        } else if (month == 3) {
            if (day > 20) {
                System.out.println("Burcunuz Koc");
            } else {
                System.out.println("Burcunuz Balik");
            }
        } else if (month==4) {
            if (day < 21) {
                System.out.println("Burcunuz Koc");
            } else {
                System.out.println("Burcunuz Boga");
            }
        } else if (month==5) {
            if (day < 22) {
                System.out.println("Burcunuz Boga");
            } else {
                System.out.println("Burcunuz Ikizler");
            }
        } else if (month==6) {
            if (day < 23) {
                System.out.println("Burcunuz Ikizler");
            } else {
                System.out.println("Burcunuz Yengec");
            }
        } else if (month==7) {
            if (day < 23) {
                System.out.println("Burcunuz Yengec");
            } else {
                System.out.println("Burcunuz Aslan");
            }
        } else if (month==8) {
            if (day < 23) {
                System.out.println("Burcunuz Aslan");
            } else {
                System.out.println("Burcunuz Basak");
            }
        } else if (month==9) {
            if (day < 23) {
                System.out.println("Burcunuz Basak");
            } else {
                System.out.println("Burcunuz Terazi");
            }
        } else if (month==10) {
            if (day < 23) {
                System.out.println("Burcunuz Terazi");
            } else {
                System.out.println("Burcunuz Akrep");
            }
        } else if (month==11) {
            if (day < 23) {
                System.out.println("Burcunuz Akrep");
            } else {
                System.out.println("Burcunuz Yay");
            }
        } else if (month==12) {
            if (day < 22) {
                System.out.println("Burcunuz Yay");
            } else {
                System.out.println("Burcunuz Oglak");
            }
        }else {
            System.out.println("Yanlis bir deger girdiniz");
        }

    }
}