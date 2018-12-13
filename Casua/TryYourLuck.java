package Casua;
import java.util.*;
public class TryYourLuck {

  public static void main(String[] args) {
Random rand = new Random();
        Scanner input = new Scanner(System.in);
       /* int array1 [] = {
            1, 2, 3, 4, 5
        };
        */
        int array2 [] = {
            1, 2, 3, 4, 5
        };
        for (int i = array2.length- 1; i > 0; i--) {
            int j = rand.nextInt(i);
                    int temp = array2[i];
                    array2[i] = array2[j];
                   array2[j] =  temp ;
        }
        //Line 59 is the comma of the commented while loop
      while(true){
            System.out.print("Enter a number in array1 : ");
        int numToBeGuessed = input.nextInt();
        while(true){
            if (numToBeGuessed > 5 || numToBeGuessed < 5) {
                System.out.print("Enter a value less than or equal to 5 : ");
            numToBeGuessed = input.nextInt();
            }else{
                break;
            }
        }
            
        System.out.print("Enter the value that you think is the index of the number you guessed : ");
        int indexOfNumGuessed = input.nextInt();
        while(true){
            if (indexOfNumGuessed > 5) {
                System.out.println("Enter a value less than or equal to Five");
                System.out.print("Enter the value that you think is the index of the number you guessed : ");;
            indexOfNumGuessed = input.nextInt();
            }else{
                break;
            }
        }
            if (array2[indexOfNumGuessed] == numToBeGuessed) {
                System.out.println("Congratulations you are correct!!!");
                 for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
               // break;
            }else{
                System.out.println("You are wrong. ): Try again");
            }
      }
       
  }

}
