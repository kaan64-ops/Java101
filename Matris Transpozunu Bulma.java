import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        System.out.println("Matris : ");
        int[][] mat=new int[2][3];
        for(int i=0;i< mat.length;i++){
            System.out.println();
            for(int j=0;j<mat[i].length;j++){
                int n= imp.nextInt();
                mat[i][j]=n;
            }
        }
        int[][] trans=new int[3][2];
        System.out.println("Transpoze : ");
        for(int i=0;i< trans.length;i++){  //3
            for(int j=0;j<trans[i].length;j++){  //2
                trans[i][j]=mat[j][i];
            }
        }
        for(int i=0;i< trans.length;i++){
            System.out.println();
            for(int j=0;j<trans[i].length;j++){
                System.out.print(trans[i][j]+" ");
            }
        }
    }
}
