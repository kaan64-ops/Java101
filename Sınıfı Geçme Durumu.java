import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int not,toplam=0,sayaç=0;
       System.out.println("Türkçe notunuzu giriniz : ");
       not= imp.nextInt();
       if(not>0&&not<100){
           toplam += not;
           sayaç++;
       }
       System.out.println("Fizik notunuzu giriniz : ");
       not=imp.nextInt();
       if(not>0&&not<100){
           toplam += not;
           sayaç++;
       }
       System.out.println("Matematik notunuzu giriniz : ");
       not=imp.nextInt();
       if(not>0&&not<100){
           toplam += not;
           sayaç++;
       }
       System.out.println("Kimya notunuzu giriniz : ");
       not=imp.nextInt();
       if(not>0&&not<100){
           toplam += not;
           sayaç++;
       }
       System.out.println("Müzik notunuzu giriniz : ");
       not=imp.nextInt();
       if(not>0&&not<100){
           toplam += not;
           sayaç++;
       }
       double average = toplam/sayaç;
       if(average<55){
           System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
       }else{
           System.out.println("Tebrikler, sınıfı geçtiniz!");
       }
       System.out.println("Ortalamanız : "+average);
        imp.close();

    }
}
