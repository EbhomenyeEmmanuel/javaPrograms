package Casua;

public class LowestTerm {

  public static void main(String[] args) {
lowestTerm();
  }

public static void lowestTerm(){
int a =  6;
int b = 2;
int gcd = 1;

while (a != 0 || b != 0){ 
   int rem = a % b;
   a = b;
   b = rem;
    
     if (a == 0){
  gcd = b;
    break;
   }else if(b == 0){
   gcd = a;
    break;
      }
    } 
  
System.out.println("The gcd is " + gcd);

/*While both the numerator and denominator can be divided by the GCD
 *If any of the numbers 
*/
  while((a / gcd != 0) || (b / gcd != 0)){
   
    if(a / gcd == 0){
      a %= gcd;
      break;
    }else if (a / gcd != 0){
      a /= gcd;
    }else if (b / gcd == 0){
      b %= gcd;
      break;
    }else if ( b / gcd != 0){
      b /= gcd;
    }
  }
  System.out.printf("%s%d/%d", "Lowest term of the numbers : ", a, b);
 }
}
