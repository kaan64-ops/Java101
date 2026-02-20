 public class Main {
        static double harmonicSum(double[] arr){
            double sum=0;
            for(int i =0;i<arr.length;i++){
                sum+=(1/arr[i]);
            }
            return arr.length/sum;
        }
     public static void main(String[] args) {
         double[] numbers = {1, 2, 3, 4, 5};
         System.out.println(harmonicSum(numbers));
     }
}
