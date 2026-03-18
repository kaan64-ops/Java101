import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static public class MineSweeper{
        static void konum(char[][] arr){
            for(int i=0;i< arr.length;i++){
                System.out.println();
                for(int j=0;j<arr[i].length;j++)
                    System.out.print(arr[i][j]+" ");
            }
        }
        static int mineCount(char[][] arr,int row,int col){
            int count=0;
            for(int i=row-1;i<=row+1;i++){
                for(int j=col-1;j<=col+1;j++){
                    if(i==row&&j==col) continue;

                    if(i>=0&&i<arr.length&&j>=0&&j<arr[i].length){
                        if(arr[i][j]=='*') count++;
                    }
                }
            }
            return count;
        }
    }


    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        System.out.print("Satır sayısını giriniz : ");
        int row= imp.nextInt();
        System.out.print("Sütun Giriniz : ");
        int col= imp.nextInt();
        while (row<2&&col<2) {
            System.out.println("2'den küçük boyut geçersizdir! Tekrar giriniz");
            row= imp.nextInt();
            col= imp.nextInt();
        }
        char[][] tarla= new char[row][col];
        int count=(row*col)/4;
        System.out.println("Mayınların konumu");
        Random rand=new Random();
        int a= tarla.length;
        int b= tarla[0].length;
        int placed=0;
        while (placed<count) {
            int r = rand.nextInt(a);
            int c = rand.nextInt(b);
            if(tarla[r][c]!='*'){
                tarla[r][c]='*';
                placed++;
            }
        }
        for(int i=0;i<tarla.length;i++){
            for(int j=0;j<tarla[i].length;j++){
                if(tarla[i][j]!='*'){
                    tarla[i][j]='-';
                }
            }
        }
        MineSweeper.konum(tarla);
        System.out.println("===========================");
        System.out.println("Mayın tarlası oyununa hoşgeldiniz !");
        char[][] dubTarla=new char[row][col];
        for(int i=0;i<dubTarla.length;i++){
            for(int j=0;j<dubTarla[i].length;j++){
                dubTarla[i][j]='-';
            }
        }
        Boolean iswin=true;
        for(int i=0;i<(row*col)-count;i++){
            MineSweeper.konum(dubTarla);
            System.out.println();
            System.out.print("Satır Giriniz : ");
            int satir= imp.nextInt();
            System.out.print("Sütun Giriniz : ");
            int sutun=imp.nextInt();
            System.out.println("===========================");
            if(tarla[satir][sutun]=='*'){
                System.out.println("Game Over!!");
                iswin=false;
                break;
            }
            int c=MineSweeper.mineCount(tarla,satir,sutun);
            char display=(char) (c+'0');
            dubTarla[satir][sutun]= display;

        }
        if(iswin) {
            System.out.println("Oyunu Kazandınız !");
            MineSweeper.konum(dubTarla);
            System.out.println("===========================");
        }
    }
}
