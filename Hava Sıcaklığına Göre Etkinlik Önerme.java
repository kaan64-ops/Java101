
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int heat;
       System.out.println("Sıcaklık giriniz : ");
       heat=imp.nextInt();
       if(heat<=25){
           if(heat<=15){
               if(heat<5){
                   System.out.println("Kayağa gidebilirsiniz.");
               }else{
                   System.out.println("Sinemaya gidebilirsiniz.");
               }
           }else{
               System.out.println("Pikniğe gidebilirsiniz.");
           }
       }else{
           System.out.println("Yüzmeye gidebilirsiniz.");
       }

        imp.close();

    }
}
