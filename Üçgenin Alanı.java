import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        double a,b,c;
        System.out.println("Üçgenin kenar uzunluklarını giriniz : ");
        a=imp.nextDouble();
        b=imp.nextDouble();
        c=imp.nextDouble();
        double u =(a+b+c)/2;
        double alannınKaresi = u*(u-a)*(u-b)*(u-c);
        double alan= Math.sqrt(alannınKaresi);
        System.out.print("üçgenin alanı : " + alan);


    }
}
