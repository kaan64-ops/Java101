import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
       int n,sum=0;
       System.out.print("Bir sayı giriniz : ");
        n= imp.nextInt();
       while(n!=0){
           sum+=n%10;
           n/=10;
       }
       System.out.println("Sayının basamak rakamlarının toplamı : "+sum);
       imp.close();

    }
}
