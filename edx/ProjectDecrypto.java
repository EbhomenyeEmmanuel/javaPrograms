package edx;
import java.util.Arrays;
public class ProjectDecrypto {

  public static void main(String[] args) {
  System.out.print(mystery(1));
  }
  public static int mystery (int x) {
    if (x == 5){
        return x;
    } else {
        return mystery(x--) * 5;
    }
}

}