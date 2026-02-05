
import java.util.Scanner;
public class Main{
    static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int r,a;
        double alan;
        System.out.print("Yarıçapı giriniz :");
        r=imp.nextInt();
        System.out.print("Açıyı giriniz :");
        a=imp.nextInt();
        alan =(3.14*(r*r)*a)/360;
        System.out.println("Dilimin alanı : "+alan);

    }
}
