
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int n1,n2,i,j=1;
        System.out.print("N1 sayısını giriniz : ");
        n1= imp.nextInt();
        i=n1;
        System.out.print("N2 sayısını giriniz : ");
        n2=imp.nextInt();
        while((n2%i)!=0||(n1%i)!=0){
        i--;
        }
        while(j%n1!=0||j%n2!=0){
            j++;
        }

        System.out.println("Girdiğiniz sayıların EBOB'u : "+i);
        System.out.println("Girdiğiniz sayıların EKOK'u : "+j);
        imp.close();

    }
}
