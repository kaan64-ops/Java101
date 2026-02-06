
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
       int yil;
       System.out.print("Yıl Giriniz : ");
       yil= imp.nextInt();
       if(yil%4==0){
           if((yil%100==0)&&(yil%400!=0)){
               System.out.println(yil+" bir artık yıldır değildir !");
           }else{
               System.out.println(yil+" bir artık yıldır !");
           }
       }else{
           System.out.println(yil+" bir artık yıldır değildir !");
       }

       imp.close();

    }
}
