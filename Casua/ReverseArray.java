package Casua;
import java.util.Arrays;
public class ReverseArray {
//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
  public static void main(String[] args) {
int [] x = {
  1, 2, 3
};
reverse(x);
  }
public static void reverse(int [] x){

System.out.println(Arrays.toString(x));
int[] y = new int[x.length];
int j = 0;
 for(int i=(x.length-1); i >= 0; i--){
  y[j] = x[i];
 j++;
 
}
System.out.println(Arrays.toString(y));
 }
}
