import java.util.Scanner;
public class Main{
    static void main(String[] args) {
        int mat,fiz,kim,tur,tarih,muz;
        Scanner imp = new Scanner(System.in);
        
        System.out.print("Matematik notunu giriniz: ");
        mat= imp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik notunu giriniz: ");
        fiz= imp.nextInt();
        System.out.println(fiz);

        System.out.print("Kimya notunu giriniz: ");
        kim= imp.nextInt();
        System.out.println(kim);

        System.out.print("Türkçe notunu giriniz: ");
        tur= imp.nextInt();
        System.out.println(tur);

        System.out.print("Tarih notunu giriniz: ");
        tarih= imp.nextInt();
        System.out.println(tarih);

        System.out.print("Müzik notunu giriniz: ");
        muz= imp.nextInt();
        System.out.println(muz);

        double toplam = mat+fiz+kim+tur+tarih+muz;
        double ortalama = toplam / 6;
        System.out.print( ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
