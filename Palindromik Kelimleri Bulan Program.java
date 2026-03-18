import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Boolean isPalindrom (String a){
        char[] arr = a.toCharArray();
        int b=0,c=a.length()-1;
        Boolean istrue ;
            while(b<c){
                istrue=arr[b]==arr[c];
                if(istrue==false){
                    return false;
                }
               else{
                   b++;
                   c--;
                }
            }
        return true;
    }

    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        String str= imp.next();
        System.out.println(isPalindrom(str));
    }
}
