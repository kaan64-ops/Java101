import java.util.Scanner;
public class Main {
    static boolean f(int n,int d){
        if(n<2){
            return false;
        }
        if(d*d>n){
            return true;
        }
        if(n%d==0){
            return false;
        }
        return f(n,d+1);
    }
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

            System.out.print("Sayı giriniz : ");
            int n= imp.nextInt();
            if(f(n,2)){
                System.out.print(n+" sayısı ASALDIR !");
            }else{
                System.out.print(n+ " sayısı ASAL değildir !");
            }




    }
}
