package Casua;

public class Sum3 {

  public static void main(String[] args) {
  int x[] = { 1, 2 , 3};
sum(x);
  }
public static void sum(int[] x){
int sum = 0;
  for (int i = 0; i < x.length; i++){
    sum += x[i];
  }
  //Use an enhanced for loop 
 System.out.println("Sum is " + sum);
 }
}
