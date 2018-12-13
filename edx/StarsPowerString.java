package edx;

public class StarsPowerString {

  public static void main(String[] args) {
double z = power(3);
string(z);
System.out.println();
 // star(z); //This method prints the sign "*" z times 
  }
  public static double power(int n){
  if (n < 0)
     throw new IllegalArgumentException("param 'n' should not be less than 0");
  else if (n == 0)
    return Math.pow(2,0);
   else if (n == 1)
    return Math.pow(2,1);
  else // Adds the power of the int to the  previous sum of the powers of the integer
    return Math.pow(2, n-1) + power(n-1);
  }
public static void string(double x){
  
  while (x>=1.0){
    System.out.print("*");
    x--;
  }
}
}
