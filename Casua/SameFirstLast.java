package Casua;

public class SameFirstLast {
//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


  public static void main(String[] args) {
int [] x = {
  1,2,1
};
sameFirstLast(x);
  }
  
public static void sameFirstLast(int[] x){

    if(x[0] == x[x.length-1] && x.length > 0){
      System.out.println(true);
    }
  }
}
