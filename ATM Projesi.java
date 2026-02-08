import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        String userName,password;
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = imp.nextLine();
            System.out.print("Parolanız : ");
            password = imp.nextLine();
            boolean isValid= userName.equals("patika")&&password.equals("dev123");
            switch (isValid ? 1:0) {
                case (1):
                    System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                    do {
                        System.out.println("1-Para yatırma\n" +
                                "2-Para Çekme\n" +
                                "3-Bakiye Sorgula\n" +
                                "4-Çıkış Yap");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                        select = imp.nextInt();
                        imp.nextLine();
                        switch (select) {
                            case (1):
                                System.out.print("Para miktarı : ");
                                int price = imp.nextInt();
                                balance += price;
                                break;
                            case (2):
                                System.out.print("Para miktarı : ");
                                price = imp.nextInt();
                                boolean priceBalance = price > balance;
                                switch (priceBalance ? 1 : 0) {
                                    case (1):
                                        System.out.println("Bakiye yetersiz.");
                                        break;
                                    case (0):
                                        balance -= price;
                                        break;
                                }
                            case (3):
                                System.out.println("Bakiyeniz : " + balance);
                                break;
                            case (4):
                                System.out.println("Tekrar görüşmek üzere.");
                                break;
                            default:
                                System.out.println("Geçersiz seçim! 1-4 arası seçiniz.");
                        }
                        }while(select!=4);

                        break;
                        case (0):
                            right--;
                            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                            switch (right){
                                case (0):
                                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                                    break;
                                default:
                                    System.out.println("Kalan Hakkınız : " + right);
                                    break;
                            }
                            break;



            }

            break;
        }
        imp.close();

    }
}
