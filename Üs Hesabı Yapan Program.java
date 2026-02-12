
import java.util.Scanner;
public class Main {
    static int f(int n,int m){
        if(m==1){
            return n;
        }else if(m==0){
            return 1;
        }
        return n*f(n,m-1);
    }
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        while(true){
            System.out.print("Taban değeri giriniz :");
            int n= imp.nextInt();
            System.out.print("Üs değerini giriniz :");
            int m= imp.nextInt();
            System.out.println("Sonuç : "+f(n,m));
        }


    }
}
