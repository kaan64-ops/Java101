
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
       int i,count=0;
       double sum=0;
       System.out.print("Sayı giriniz : ");
       i= imp.nextInt();
       while(i>=0){
           if(i%3==0||i%4==0){
               sum+=i;
               count++;
           }
           i--;
       }
       System.out.println("3 ile 4'e bölünen sayıların ortalaması : "+(sum/count));
       imp.close();

    }
}
