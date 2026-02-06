import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        String userName,correctPassword="Şifre",password,newPassword;
        int select;
        System.out.println("Kullanıcı adınız : ");
        userName=imp.nextLine();
        System.out.println("Şifreniz : ");
        password=imp.nextLine();
        if(!password.equals(correctPassword)){
            System.out.println("Şifreniz Yalnış,şifreyi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
            select= imp.nextInt();
            imp.nextLine();
            switch (select){
                case(1):
                    System.out.println("Yeni şifreyi giriniz : ");
                    newPassword= imp.nextLine();
                    if(newPassword.equals(correctPassword)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else{
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                case(2):
                    System.out.println("Şifreyi değiştirmemeyi seçtiniz.");
                    break;
                default:
                    System.out.println("Geçersiz komut girdiniz.");
            }

        }else{
            System.out.println("Giriş başarılı.");
        }
        imp.close();

    }
}
