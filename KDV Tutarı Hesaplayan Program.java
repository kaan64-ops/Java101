import java.util.Scanner;
public class Main{
    static void main(String[] args) {
        double deger;
        Scanner imp = new Scanner(System.in);
        System.out.print("tutarı giriniz : " );
        deger = imp.nextDouble();
        double kdv = deger>1000 ? 8 : 18;
        System.out.println("Kdv'li tutar : " + ((deger/100)*kdv+deger));
        System.out.println("kdv tutarı : " + ((deger/100)*kdv));


    }
}
