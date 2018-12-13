package edx;
import java.util.ArrayList;
public class ArrayListMystery3 {

  public static void main(String[] args) {
 ArrayList<Integer> list = new ArrayList<Integer>();
   list.add(10);
  list.add(20);
  list.add(30);
  list.add(40);
    mystery3(list);
  }
 public static void mystery3(ArrayList<Integer> list) { 
    for (int i = list.size() - 2; i > 0; i--) { 
        int a = list.get(i); 
        int b = list.get(i + 1); 
        list.set(i, a + b); 
    } 
    System.out.println(list); 
  }
}
