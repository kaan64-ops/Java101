import java.util.Scanner;
public class Main {
    static String Palindrom(int num) {
        int counter = 0;
        boolean isTrue = false;
        if (num >= 0 && num < 10) {
            return "Palindromdur.";
        } else {
            int temp=num;
            while(temp!=0){
                counter++;
                temp= temp/10;
            }

            if (counter != 1) {

                for (int i = 1; i <= counter / 2; i++) {
                    int leftDigit  = (int)(num / Math.pow(10, counter - i)) % 10;
                    int rightDigit = (int)(num / Math.pow(10, i - 1)) % 10;
                    if (leftDigit != rightDigit) {
                        return "Palindrom değildir.";
                    }

                }
                return "Palindromdur.";
            } else {
                return "Palindromdur.";
            }
        }
    }


    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        System.out.print("Sormak istediğiniz sayıyı giriniz :");
        int n =imp.nextInt();
        System.out.println(Palindrom(n));
        imp.close();
    }
}
