import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        double km;
        System.out.print("Kaç kilometre gittiğini yazınız : ");
        km=imp.nextDouble();
        double tutar = km*2.20+10;
        tutar = (tutar<=20) ? 20:tutar;
        System.out.println("Ödenecek tutar : "+tutar );


    }
}
