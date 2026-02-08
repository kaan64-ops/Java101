
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int n;
        int k=0;
        int l= 1;
        int counter=0;
        System.out.print("Kaç Fibonacci elemanı istiyorsunuz? : ");
        n= imp.nextInt();
        n-=2;
        System.out.print("0 1 ");
        for(int i=1;i<=n;i++){
            k=k+l;
            System.out.print(k+" ");
            counter++;
            if(counter==n){
                break;
            }

            l=k+l;
            System.out.print(l+" ");
            counter++;
            if(counter==n){
                break;
            }

        }
        imp.close();

       }

    }
