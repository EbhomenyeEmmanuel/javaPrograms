package Casua;

public class CommonEnd {
//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
  public static void main(String[] args) {
int [] a = {
  1,2,3
};
int [] b = {
  2,3
};
commonEnd(a,b);
  }
public static void commonEnd(int [] a, int b[]){
  if (a[0] == b[0] || a[a.length - 1] == b[b.length -1]){
    System.out.println(true);
  }
 }
}
