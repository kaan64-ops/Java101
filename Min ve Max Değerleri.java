import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int n,j=0,l=0,k;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n= imp.nextInt();
        do{
            for(int i =1;i<=n;i++){
                System.out.print(i+". Sayıyı giriniz: ");
                k= imp.nextInt();
                if(k>j||k==j){
                    j=k;
                }
                if(k<l||k==l){
                    l=k;
                }
                n--;
            }

        }
        while(n>0);
        System.out.print("En büyük sayı: "+j+"\n");
        System.out.print("En küçük sayı: "+l);


        imp.close();

    }
}
