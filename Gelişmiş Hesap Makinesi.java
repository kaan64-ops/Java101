
import java.util.Scanner;
public class Main {

    static void plus() {
        Scanner imp = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = imp.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner imp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = imp.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = imp.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner imp = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = imp.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner imp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = imp.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = imp.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner imp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = imp.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = imp.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner imp = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = imp.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void mod(){
        Scanner imp = new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz :");
        int n= imp.nextInt();
        System.out.print("Modülü giriniz :");
        int b=imp.nextInt();
        System.out.println("Sonuç : "+n%b);
    }
    static  void rect(){
        Scanner imp = new Scanner(System.in);
        System.out.println("1- Alan Hesabı\n2-Çevre Hesabı");
        int n= imp.nextInt();
        switch (n){
            case 1:
                System.out.print("Birinci ve ikinci kernar uzunluklarını giriniz :");
                int a= imp.nextInt();
                int b= imp.nextInt();
                System.out.println("Sonuç : "+a*b);
                break;
            case 2:
                System.out.print("Birinci ve ikinci kernar uzunluklarını giriniz :");
                 a= imp.nextInt();
                 b= imp.nextInt();
                System.out.println("Sonuç : "+(a+b)*2);
                break;
            default:
                System.out.println("Geçersiz numara girdiniz!");
        }
    }


    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = imp.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case  7:
                    mod();
                    break;
                case  8:
                    rect();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
