
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
       int i;
       double sum=0;
       do{ System.out.print("Çift sayı giriniz : ");
           i= imp.nextInt();
           if(i%2==0){
               sum+=i;
           }
       }while(i%2==0);
       System.out.println("Sayıların toplamı : "+sum);
       imp.close();

    }
}
