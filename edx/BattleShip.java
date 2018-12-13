package edx;
import java.util.Scanner;
public class BattleShip {
// I commented on line 20
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("***Welcome to BattleShips Game***");
  System.out.println("Right now the ship is empty.");
  System.out.println("   0 1 2 3 4 5 6 7 8 9 ");
  
char [][] ocean = new char[10][10];
for (int row = 0; row < ocean.length; row++) {
System.out.print(row + "|");
 for (int column = 0; column <    ocean[row].length; column++) {
 if (ocean[row][column] == Character.MIN_VALUE){
   System.out.print(" ");
 }else{
   System.out.print(ocean[row][column]);
 }
 System.out.print(ocean[row][column] + " ");
 }
 System.out.println("|" + row);
 
     }
     System.out.println("   0 1 2 3 4 5 6 7 8 9 ");
        
      for(int i =0 ; i <= 5; i++){
      
      System.out.println("Enter the coordinates for the X axis");
       int x = input.nextInt();
       System.out.println("Enter the coordinates for the Y axis");
       int y = input.nextInt();
     while ( true ){
        if (x > 9 ){        
 System.out.println("Coordinate of X cannot be greater than 9");
 x = input.nextInt();
       }
    else if (y > 9){        
 System.out.println("Coordinate of Y cannot be greater than 9");
 y = input.nextInt();
       } else{
         break ;
       }
     }
     ocean[x][y] = '@';
   }
     
     System.out.println("  0123456789");
 for (int row = 0; row < ocean.length; row++) {
System.out.print(row + "|");
  for (int column = 0; column <    ocean[row].length; column++) {
   if (ocean[row][column] == Character.MIN_VALUE){
   System.out.print(" ");
    }else{
   System.out.print(ocean[row][column]);
      }
   }
 System.out.println("|" + row);
 
 }
      System.out.println("  0123456789");
      
  }

}
