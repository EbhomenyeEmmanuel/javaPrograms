package edx;

public class RectangularArray {

  public static void main(String[] args) {
/*
 *Assume that a two-dimensional rectangular array of integers called data has been declared with four rows and seven columns. 
 *Write a for loop to initialize the third row of data to store the numbers 1 through 7.
 */
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
