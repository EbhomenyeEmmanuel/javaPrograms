package Casua;

public class FirstLast6 {
//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
  public static void main(String[] args) {
int [] x = {
  6,1,2,3,6,9,6
};
firstLast(x);
  }
public static void firstLast(int[] x){
  for (int i = 0; i < x.length; i++){
    if(x[i] == 6 ){
      System.out.println(" The array contains 6 with the index " + i);
    }
  }
}
}
