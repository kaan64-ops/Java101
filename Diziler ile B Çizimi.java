
public class Main {
     public static void main(String[] args) {
         String[][] letter = new String[7][3];

         for (int i = 0; i < letter.length; i++) {
             for (int j = 0; j < letter[i].length; j++) {
                 if ((i == 0 || i == 3||i==6)&&j==0) {
                     letter[i][j] = "* ";
                 } else if ((i==1||i==2||i==4||i==5)&&j==1) {
                     letter[i][j]= "      ";
                 }else{
                     letter[i][j]="* * ";
                 }

             }
         }

         for(int i=0;i<letter.length;i++){
            for( int j=0;j<letter[i].length;j++){
                 System.out.print(letter[i][j]);
             }
             System.out.println();
         }
     }
}
