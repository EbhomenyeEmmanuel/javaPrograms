
package LOOPS;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberUsingWhileLoop {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

int guess = 0;

Random esq = new Random();
int Rand = 0;
  

while ( Rand == guess ){ 
    //The code runs because initially the statement is true
    
    Rand = esq.nextInt(101);  
    System.out.println("­ Rand is " + Rand);
System.out.print("Enter your Guess: ");
    guess = input.nextInt();
    //The variables are now modified
    // The if statement works now
    //If the loop statement is false , the if statement works on the code
    //If the loop statement is true , the loop runs till infinity I.e it prints "Enter ur guess " as many times as possible 
    System.out.println("­ Rand is " + Rand);
if (Rand < guess)
System.out.println("Guess is greater than Rand");
else if(Rand > guess)
System.out.println(" Guess is less than Rand");
else
System.out.println(" Guess is equal to Rand");

        }
    }
}