
package javaapplication1;
import java.util.Random;
import java.util.Scanner;
public class JavaApplication1 {

    
    public static void main(String[] args) {
       /* The problem is to guess what number a computer has in mind. You will write a program that
randomly generates an integer between 0 and 100, inclusive.
        *The program prompts the user to enter a number continuously until the number matches the randomly generated number. For
each user input, the program tells the user whether the input is too low or too high, so the user
can make the next guess intelligently 
        */
     Scanner input = new Scanner(System.in);
     int userNum = 0;
int randomNum = 0;
Random random = new Random();
do
{
randomNum = random.nextInt(101);

System.out.print("Please input the number your guessing : ");
userNum = input.nextInt();

if(randomNum < userNum)
{
System.out.println ("Your number is too high");
}
else if (randomNum > userNum)
{
System.out.println ("Your number is too low");
}
else
{
System.out.println ("Congratulations you have guessed it.");
break;
}

}
while (randomNum != userNum);
  
 
    }
    
}
