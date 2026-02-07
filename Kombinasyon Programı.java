import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
       int n,r,sum1=1,sum2=1,sum3=1;
       System.out.print("Küme eleman sayısını giriniz : ");
        n= imp.nextInt();
       System.out.print("Grup eleman sayısını giriniz : ");
       r= imp.nextInt();
       if(n<r||n<=0||r<0){
           System.out.println("Geçersiz eleman sayısı girdiniz ! ");
           return;
       }
       for(int i=1;i<=n;i++){
       sum1=sum1*i;
       }
       for(int i=1;i<=r;i++){
           sum2=sum2*i;
       }
       if(n-r!=0) {
           for (int i = 1; i <= (n - r); i++) {
               sum3 = sum3 * i;
           }
       }else{
           sum3=1;
       }
       System.out.println("Kombinasyon : "+(sum1/(sum2*sum3)));
       imp.close();

    }
}
