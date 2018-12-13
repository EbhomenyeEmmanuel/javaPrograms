package edx;

public class JaggedArray {
/*
*Write a piece of code that constructs a jagged two-dimensional array of integers named jagged with five rows and an increasing number of columns in each row, such that the first row has one column, the second row has two, the third has three, and so on. *The array elements should have increasing values in top-to-bottom, left-to-right order (also called row-major order). 
*In other words, the array's contents should be the following:

1
2, 3
4, 5, 6
7, 8, 9, 10
11, 12, 13, 14, 15
 */
  public static void main(String[] args) {
int[][] data = new int[5][];

data[0] = new int[1];
data[1] = new int[2];
data[2] = new int[3];
data[3] = new int[4];
data[4] = new int[5];

int count = 1;
for (int row = 0; row <data.length; row++) {
   
for (int column = 0; column < data
[row].length; column++) {   
data[row][column] = count;
   ++count;
 }

}

for (int row = 0; row <data.length; row++) {
   
for (int column = 0; column < data
[row].length; column++) {   
System.out.print(data[row][column] + " " );

 }
System.out.println();
}
  }

}
