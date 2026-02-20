import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
         int[] list = {15,12,788,1,-1,-778,2,0};
         int small=0;
         int big=0;
         boolean bigFound=false;
         boolean smallFound=false;
         Scanner imp=new Scanner(System.in);
         System.out.print("Bir sayı giriniz : ");
         int n= imp.nextInt();
         for(int i=0;i<list.length;i++){
             if(list[i]>n){
                 if(!bigFound||list[i]<big){
                     big=list[i];
                     bigFound=true;
                 }
             }
             if(list[i]<n){
                 if(!smallFound||list[i]>small){
                     small=list[i];
                     smallFound=true;
                 }
             }
         }
         if(smallFound) {
             System.out.println("Girilen sayıdan küçük en yakın sayı : " + small);
         }else{
             System.out.println("Girilen sayıdan küçük bir sayı yok!");
         }
         if(bigFound) {
             System.out.println("Girilen sayıdan büyük en yakın sayı : " + big);
         }else{
             System.out.println("Girilen sayıdan büyük bir sayı yok!");
         }
     }
}
