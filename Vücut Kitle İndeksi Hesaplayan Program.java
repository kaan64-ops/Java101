import java.util.Scanner;
public class Main{
    static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
       double boy,kilo,sonuç;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz :");
        boy=imp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo=imp.nextDouble();
        sonuç=kilo/(boy*boy);
        System.out.println("Vücut kütle indeksiniz : "+sonuç);

    }
}
