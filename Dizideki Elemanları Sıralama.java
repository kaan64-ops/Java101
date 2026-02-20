import java.util.Arrays;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
         Scanner imp=new Scanner(System.in);
         System.out.print("Dizinin boyutu n : ");
         int n= imp.nextInt();
         System.out.println("Dizinin elemanlarını giriniz :");
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
             System.out.print((i+1)+". Elemanı : ");
             int x=imp.nextInt();
             arr[i]=x;
         }
         Arrays.sort(arr);
         System.out.print("Sıralama : ");
         for(int i:arr){
             System.out.print(i+" ");
         }
     }
}
