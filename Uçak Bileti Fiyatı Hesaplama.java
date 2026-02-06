import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
      int km,yas,tip;
       System.out.print("Mesafeyi km türünden giriniz : ");
       km= imp.nextInt();
       System.out.print("Yaşınızı giriniz : ");
       yas= imp.nextInt();
       System.out.print("Yolculuk tipini giriniz (1 => Tek Yön ,2 => Gidiş Dönüş ): ");
       tip= imp.nextInt();
       if(km<=0){
           System.out.println("Hatalı Veri Girdiniz !");
           return;
       }
       double tutar = (km*0.10);
       if(0<yas&&yas<12){
           tutar= tutar/2;
       } else if (yas>=12&&yas<=24) {
           tutar=tutar-(tutar*0.10);
       } else if (yas>65) {
           tutar=tutar-(tutar*0.30);
       }else{
               System.out.println("Hatalı Veri Girdiniz !");
               return;
       }
       switch (tip){
           case(1):
               System.out.println("Toplam tutar = "+tutar);
               break;
           case (2):
               System.out.println("Toplam tutar = "+((tutar-(tutar*0.20))*2) + " Tl");
               break;
           default:
               System.out.println("Hatalı Veri Girdiniz !");
       }

       imp.close();

    }
}
