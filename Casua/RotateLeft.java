package Casua;
import java.util.Arrays;
public class RotateLeft {
//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
  public static void main(String[] args) {
int [] x = {
  1, 2, 3
};

rotate(x);
  }

 public static void rotate(int [] x){
 int [] y = new int[x.length];
  for(int i =0; i < y.length; i++){
    if(i == 0){
    y[i] = x[1];
    }else if(i == 1){
    y[i] = x[x.length - 1];
     }else{
    y[i] = x[0];
  }  
    }

System.out.println(Arrays.toString(y));
 }
}
