import java.util.Scanner;
public class Main {
    static int f(int n,int c){
        System.out.print(n+" ");
        if(n>0) {
            return f(n - 5,c+1);
        }else{
            return m(n,c);
        }
    }
    static int m(int n,int c){
        System.out.print(n+5+" ");
        if(c-1==0){
            return n+5;
        }
        return m(n+5,c-1);

    }
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n= imp.nextInt();
        System.out.print("Çıktısı : ");
        f(n,0);
            imp.close();
    }
}
