import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
      int day,mounth;
       System.out.println("Doğduğunuz ay : ");
       mounth= imp.nextInt();
       System.out.println("Doğduğunuz gün : ");
       day= imp.nextInt();
       if(mounth==3&&day>=21||mounth==4&&day<=20) {
           System.out.println("Koç Burcu");
       }else if(mounth==4&&day>=21||mounth==5&&day<=21) {
           System.out.println("Boğa Burcu");
       }else if(mounth==5&&day>=22||mounth==6&&day<=22) {
           System.out.println("İkizler Burcu");
       }else if(mounth==6&&day>=22||mounth==7&&day<=22) {
           System.out.println("Yengeç Burcu");
       }else if(mounth==7&&day>=23||mounth==8&&day<=22) {
           System.out.println("Aslan Burcu");
       }else if(mounth==8&&day>=23||mounth==9&&day<=22) {
           System.out.println("Başak Burcu");
       }if(mounth==9&&day>=23||mounth==10&&day<=22) {
           System.out.println("Terazi Burcu");
       }else if(mounth==10&&day>=23||mounth==11&&day<=21) {
           System.out.println("Akrep Burcu");
       }else if(mounth==11&&day>=22||mounth==12&&day<=21) {
           System.out.println("Yay Burcu");
       }else if(mounth==12&&day>=22||mounth==1&&day<=21) {
           System.out.println("Oğlak Burcu");
       }else if(mounth==1&&day>=22||mounth==2&&day<=19) {
           System.out.println("Kova Burcu");
       }else if(mounth==2&&day>=20||mounth==3&&day<=20) {
           System.out.println("Balık Burcu");
       }else{
           System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
       }


       imp.close();

    }
}
