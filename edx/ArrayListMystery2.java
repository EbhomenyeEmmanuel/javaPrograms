package edx;
import java.util.ArrayList;
public class ArrayListMystery2 {

  public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<Integer>();
   list.add(-1);
  list.add(3);
  list.add(28);
  list.add(17);
  list.add(9);
  list.add(33);
  
//  System.out.println();

mystery2(list);
  }
  
public static void mystery2(ArrayList<Integer> list) {
    for (int i = list.size() - 1; i >= 0; i--) {
        if (i % 2 == 0) {
            list.add(list.get(i));
        } else{
            list.add(0, list.get(i));
        }
    }
    System.out.println(list);
  }
}
