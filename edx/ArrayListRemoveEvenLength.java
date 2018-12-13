package edx;
import java.util.ArrayList;
public class ArrayListRemoveEvenLength {
/*
*Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of the strings of even length from the list.
*/
  public static void main(String[] args) {
ArrayList<String> str = new ArrayList<String>();
str.add("A");
str.add("BC");
str.add("BCD");
str.add("BCDE");

 removeEvenLength(str);
  }
public static void removeEvenLength(ArrayList<String> str) {
    for (int i = 0; i < str.size(); i++) {
        if (( str.get(i).length() % 2) == 0) {
            str.remove(i);
        }
     }
    System.out.println(str);
   }
}
