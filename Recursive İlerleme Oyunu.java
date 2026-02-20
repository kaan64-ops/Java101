import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static boolean canWin(int[] game,int leap){
        boolean[] visit = new  boolean[game.length];
        return result(game,leap,visit,0);
    }
    static boolean result(int[] game,int leap,boolean[] visit,int i){
        int n= game.length;
        if(i>=n) return true;
        if(i<0) return false;
        if(game[i]==1) return false;
        if(visit[i]) return false;
        visit[i]=true;
        return result(game,leap,visit,i+leap)||result(game, leap, visit, i+1)||
                result(game, leap, visit, i-1);
    }
    public static void main(String[] args) {
        Scanner imp= new Scanner(System.in);
        int q= imp.nextInt();
        if(q>=1&&q<=5000) {
            for (int i = 0; i < q; i++) {
                int n = imp.nextInt();
                if (n >= 2 && n <= 100) {
                    int leap = imp.nextInt();
                    if(leap>=0&&leap<=100) {
                        int[] arr = new int[n];
                        for (int j = 0; j < n; j++) {
                            int in = imp.nextInt();
                            arr[j] = in;
                        }
                        if (canWin(arr, leap)) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    }
                }
            }
        }
    }
}
