
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
       int n,count=0;
       System.out.print("Bir sayı giriniz : ");
       n= imp.nextInt();
       for (int i=1;i<n;i++){
           for (int j=0;j<n-i;j++){
               System.out.print(" ");
           }
           for(int k=0;k<2*i-1;k++){
               System.out.print("*");
           }
           System.out.println(" ");

       }


       for(int i =0;i<n;i++){
          for(int j=1;j<=((n-i)*2)-1;j++){
              System.out.print("*");
          }
           System.out.println(" ");
          for(int k=i;k<(i*2)+1;k++){
              System.out.print(" ");
          }
       }
       imp.close();

    }
}
