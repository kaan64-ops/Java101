
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
       int n,r;
       System.out.print("Üssüne alınacak sayıyı giriniz : ");
        n= imp.nextInt();
       System.out.print("Üssü olucak sayıyı giriniz : ");
       r= imp.nextInt();
       int total=1;
       for(int i =1;i<=r;i++){
          total*=n;
       }
       System.out.println("Sonuç : "+total);
       imp.close();

    }
}
