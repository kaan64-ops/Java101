import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static int count(int[] arr){
            int n = arr.length;
            int count=0;
             for(int i=0;i<n;i++){
                 int sum=0;
                for (int j = i; j < n; j++) {
                    sum+=arr[j];
                    if(sum<0) count++;
                }

            }
            return count;
    }
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        int n= imp.nextInt();
        if(n>=1&&n<=100) {
            int[] mat = new int[n];
            for (int i = 0; i < mat.length; i++) {
                int m = imp.nextInt();
                if (m > -10000 && m < 10000) {
                    mat[i] = m;
                }
            }
            System.out.println(count(mat));
        }

    }
}
