package edx;

public class Arrays {

  public static void main(String[] args) {
 java.util.Scanner input = new 
java.util.Scanner(System.in);
int[][] data = new int[4][7];
   for (int row = 0; row <data.length; row++) {
   int count = 1;
for (int column = 0; column < data
[row].length; column++) {   
if(row == 2){
  data[2] = new int [7];  
   }
   data[2][column] = count;
   ++count;
 }
// System.out.print("\t");
}
  
for (int row = 0; row < data.length; row++) {
 for (int column = 0; column <    data[row].length; column++) {
 System.out.print(data[row][column] + " ");
 }
 System.out.println();
}
  }

}
