
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int n;
        System.out.print("Bir sayı giriniz :");
        n=imp.nextInt();
        for (int j=0;j<n;j++) {
            for (int i = 0; i<2*(n-j)-1; i++ ) {
                System.out.print("*");

            }
            System.out.println("");

        }

        imp.close();

       }

    }
