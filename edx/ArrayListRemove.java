package edx;
import java.util.ArrayList;
public class ArrayListRemove {

  public static void main(String[] args) {
 ArrayList<String> myList = new
ArrayList<String>();
 myList.add("A");
 myList.add("B");
 myList.add("C");
for (int i = 0; i < myList.size(); i++) {
    myList.remove(i);
 }
System.out.println(myList);
  }

}
