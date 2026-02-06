
import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        double ar=2.14,el=3.67,dom=1.11,muz=0.95,pa=5.0;
        System.out.println("Armut kaç kilo ? :");
        int a = imp.nextInt();
        System.out.println("Elma kaç kilo ? :");
        int b = imp.nextInt();
        System.out.println("Domates kaç kilo ? :");
        int c = imp.nextInt();
        System.out.println("Muz kaç kilo ? :");
        int d = imp.nextInt();
        System.out.println("Patlıcan kaç kilo ? :");
        int e = imp.nextInt();
        double toplam = a*ar+b*el+c*dom+d*muz+e*pa;
        System.out.println("Toplam tutar : "+toplam+" TL");

    }
}
