import java.util.Arrays;
public class Main {
    static boolean isFind(int[] arr,int value){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] dublicate = new int[list.length];
        int startIndex=0;
        System.out.println("Tekrar Sayıları");
        for(int i=0;i< list.length;i++){
            if(isFind(dublicate,list[i])){
                continue;
            }
            int count =0;
            for(int j=0;j< list.length;j++){
                if(list[j]==list[i]){
                    count++;
                }
            }
            dublicate[startIndex++]=list[i];
            System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
        }

    }
}
