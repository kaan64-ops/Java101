import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner imp = new Scanner(System.in);
       int i;
       System.out.print("Bir sayı giriniz : ");
       i= imp.nextInt();
       System.out.print("4'ün kuvvetleri : ");
       for(int j=1;j<=i;j*=4){
           System.out.print(j+" ");
       }
       System.out.print("\n5'in kuvvetleri : ");
       for(int j=1;j<=i;j*=5){
           System.out.print(j+" ");
       }
       imp.close();

    }
}
