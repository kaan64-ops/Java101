import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
       double sum=0,n;
       System.out.print("Bir sayı giriniz : ");
       n= imp.nextDouble();
       for(double i=1;i<=n;i++){
           sum+=1/i;
       }
       System.out.println("Girdiğiniz sayının harmonik serisi : "+sum);
       imp.close();

    }
}
