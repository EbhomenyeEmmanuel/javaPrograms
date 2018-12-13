package edx;
import java.util.ArrayList;
public class HelloWorld {

  public static void main(String[] args) {
//System.out.println("Hello World");
 ArrayList<String> myList = new ArrayList<String>();
myList.add("A");
myList.add("B");
myList.add("C");

myList.add("D");

for (int i = 0; i < myList.size(); i++) {
    myList.remove(i);
}
System.out.println(myList);
  }

}
