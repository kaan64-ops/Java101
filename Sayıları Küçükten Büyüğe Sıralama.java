import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int inp1,inp2,inp3;
       System.out.println("1. sayı : ");
       inp1= imp.nextInt();
       System.out.println("2. sayı : ");
       inp2=imp.nextInt();
       System.out.println("3. sayı : ");
       inp3= imp.nextInt();
       if(inp1<inp2&&inp1<inp3){
           if(inp2<inp3){
               System.out.println(inp1+" < "+inp2+" < "+inp3);
           }else{
               System.out.println(inp1+" < "+inp3+" < "+inp2);
           }
       } else if (inp2<inp1&&inp2<inp3) {
           if(inp1<inp3){
               System.out.println(inp2+" < "+inp1+" < "+inp3);
           }else{
               System.out.println(inp2+" < "+inp3+" < "+inp1);
           }
       } else if (inp3<inp1&&inp3<inp2) {
           if(inp1<inp2){
               System.out.println(inp3+" < "+inp1+" < "+inp2);
           }else{
               System.out.println(inp3+" < "+inp2+" < "+inp1);
           }
       }

       imp.close();

    }
}
